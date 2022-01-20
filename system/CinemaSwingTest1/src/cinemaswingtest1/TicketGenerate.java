package cinemaswingtest1;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
 
import javax.imageio.ImageIO;

public class TicketGenerate {
    
    public void generateTicket() throws IOException {
 
        final String QR_CODE_IMAGE_PATH = "src/cinemaswingtest1/image/QRCode.png";
        
        try {
            generateQRCodeImage(String.format("GSC Ticket\nSeat: %s\nHall: %s\nMovie: %s\nTiming: %s, %s", 
                    Global.seat_no, Global.hall, Global.movie_name, Global.day, Global.time), 
                    150, 150, QR_CODE_IMAGE_PATH);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
        
        int width = 500;
        int height = 250;
 
        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage info = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        BufferedImage qr = ImageIO.read(new File("src/cinemaswingtest1/image/QRCode.png"));
 
        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = info.createGraphics();
 
        // fill all the image with black
        g2d.setColor(new java.awt.Color(34,34,34));
        g2d.fillRect(0, 0, width, height);
 
        // create a roundRect with black
        g2d.setColor(Color.darkGray);
        g2d.fillRoundRect(20, 20, width-40, height-40, 80, 80);
 
        // create string
        g2d.setColor(Color.white);
        g2d.drawString("GSC", 50, 50);
        
        g2d.setColor(Color.white);
        g2d.drawString("TICKET", 150, 50);
        
        g2d.setColor(Color.white);
        g2d.drawString("Seat", 50, 90);
        
        g2d.setColor(Color.white);
        g2d.drawString(Global.seat_no, 100, 90);
        
        g2d.setColor(Color.white);
        g2d.drawString("Hall", 50, 130);
        
        g2d.setColor(Color.white);
        g2d.drawString(String.valueOf(Global.hall), 100, 130);
        
        g2d.setColor(Color.white);
        g2d.drawString("Movie", 50, 170);
        
        g2d.setColor(Color.white);
        g2d.drawString(Global.movie_name, 100, 170);
        
        g2d.setColor(Color.white);
        g2d.drawString("Timing", 50, 210);
        
        g2d.setColor(Color.white);
        g2d.drawString(Global.day + ", " + Global.time, 100, 210);
        
        g2d.drawLine(263, 30, 263, 220);
        
        g2d.drawImage(qr, 300, 50, null);
 
        // Disposes of this graphics context and releases any system resources that it is using. 
        g2d.dispose();
 
        // Save as PNG
        File file = new File("src/cinemaswingtest1/image/Ticket.png");
        ImageIO.write(info, "png", file);
 
    }
    
    private static void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
    
}
