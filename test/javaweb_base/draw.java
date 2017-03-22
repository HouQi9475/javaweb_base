package javaweb_base;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

import com.leo.javaweb.utils.VerifyCode;

public class draw {

	@Test
	public void picture() throws FileNotFoundException, IOException{
		//创建VerifyCode对象
		VerifyCode vc=new VerifyCode();
		//创建图片缓冲区,得到图片
		BufferedImage bi=vc.getImage();
		vc.output(bi, new FileOutputStream("d:/a.jpg"));
		System.out.println(vc.getText());
	}
}
