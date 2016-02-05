package ua.org.oa.ansimov;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;




public class MyServlet extends HttpServlet {
       

	public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/uploader.jsp");
		dispatcher.forward(request, response);
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String path_dir = "/home/alex/git/JavaEE-projects/ImageUploader/WebContent/";
		System.out.println(path_dir);
		String namePathOfImages = path_dir + File.separator + "saved_image";
		File saveDir = new File(namePathOfImages);
		if (!saveDir.exists()) {
			saveDir.mkdir();
		}		
			System.out.println(saveDir.exists());		
			
		Part part = request.getPart("fileImg");
		String fileName = part.getSubmittedFileName();
		if (fileName.matches(".+\\.(jpg|jpeg)")) {
			String picturePath = namePathOfImages + File.separator + fileName;
			part.write(picturePath);
		}
		List<String> names = new ArrayList<>();
		names.add("saved_image/image2.jpg");
		names.add("saved_image/image3.jpg");
		names.add("saved_image/image4.jpg");
		
		request.setAttribute("path", "saved_image/");
		request.setAttribute("names", names);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/uploader.jsp");
		dispatcher.forward(request, response);
			
	
	}

}









