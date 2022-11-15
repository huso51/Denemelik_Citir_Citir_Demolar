package com.huseyinaydin;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.bytedeco.javacpp.opencv_imgcodecs;
import org.opencv.core.Core;
import org.opencv.core.CvException;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.bytedeco.javacv.FrameGrabber.Exception;

public class Main extends opencv_imgcodecs {

	private static JFrame frame;
	private static JLabel lbl;
	private static ImageIcon icon;
	private static VideoCapture videoDevice;
	private static boolean donguDurumu = false;

	public static void main(String[] args) {
		System.load(new File(
				"D:\\yedekss\\opencv-3.4.2-vc14_vc15\\opencv\\build\\java\\x64\\" + Core.NATIVE_LIBRARY_NAME + ".dll")
						.getAbsolutePath());

		CascadeClassifier cascadeFaceClassifier = new CascadeClassifier(
				"D:\\yedekss\\Documents\\a\\haarcascade_frontalface_alt.xml");
		CascadeClassifier cascadeEyeClassifier = new CascadeClassifier(
				"D:\\yedekss\\Documents\\a\\haarcascade_eye.xml");

		videoDevice = new VideoCapture();
		try {
			videoDevice.open(0);
		} catch (CvException e) {
			System.err.println("istisnalar kaideyi bozmaz " + e.getMessage());
		}
		if (videoDevice.isOpened()) {
			Runnable runnable = () -> {
				while (true) {
					Mat frameCapture = new Mat();
					videoDevice.read(frameCapture);
					MatOfRect faces = new MatOfRect();
					cascadeFaceClassifier.detectMultiScale(frameCapture, faces);
					int i = 0;
					for (Rect rect : faces.toArray()) {
						i++;
						Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y),
								new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(100, 100, 100), 2);
					}
					if (i > 1) {
						System.out.println("Sistemde birden fazla y�z var. Birisi geri ��ks�n!");
					}
					MatOfRect eyes = new MatOfRect();
					cascadeEyeClassifier.detectMultiScale(frameCapture, eyes);
					int gozSayisi = 0;
					for (Rect rect : eyes.toArray()) {
						gozSayisi++;
						Imgproc.rectangle(frameCapture, new Point(rect.x, rect.y),
								new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(200, 200, 100), 2);
					}
					if (gozSayisi == 1) {
						System.out.println("tek gozlu canavar!");
					}
					gozSayisi = 0;
					try {
						PushImage(ConvertMat2Image(frameCapture));
					} catch (IOException e) {
						e.printStackTrace();
					}
					if(donguDurumu)
						break;
				}
			};
			Thread thread = new Thread(runnable);
			thread.start();
		} else {
			System.out.println("Video ayg�t�na ba�lan�lamad� veya sistem de video ayg�t� (web cam) yok.");
			return;
		}
	}

	private static BufferedImage ConvertMat2Image(org.opencv.core.Mat kameraVerisi) throws IOException {
		MatOfByte byteMatVerisi = new MatOfByte();
		try {
			Imgcodecs.imencode(".jpg", kameraVerisi, byteMatVerisi);
		} catch (CvException e) {
			donguDurumu = true;
			System.err.println("istisnalar kaideyi bozmaz " + e.getMessage());
			return null;
		}
		byte[] byteArray = byteMatVerisi.toArray();
		BufferedImage goruntu = null;
		try {
			InputStream in = new ByteArrayInputStream(byteArray);
			goruntu = ImageIO.read(in);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return goruntu;
	}

	public static void PencereHazirla() {
		frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		frame.setSize(700, 600);
		frame.setVisible(true);

		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowClosing(WindowEvent e) {
			}

			@Override
			public void windowClosed(WindowEvent e) {
				videoDevice.release();
			}

			@Override
			public void windowOpened(WindowEvent e) {

			}

			@Override
			public void windowIconified(WindowEvent e) {

			}

			@Override
			public void windowDeiconified(WindowEvent e) {

			}

			@Override
			public void windowActivated(WindowEvent e) {

			}

			@Override
			public void windowDeactivated(WindowEvent e) {

			}
		});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void PushImage(Image img2) {
		if(img2 == null) {
			System.err.println("kamera kullanıma kapalı!");
			return;
		}
		if (frame == null)
			PencereHazirla();
		if (lbl != null)
			frame.remove(lbl);
		
		icon = new ImageIcon(img2);
		lbl = new JLabel();
		lbl.setIcon(icon);
		frame.add(lbl);
		frame.revalidate();
	}

}
