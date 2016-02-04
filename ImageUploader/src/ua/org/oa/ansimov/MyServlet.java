package ua.org.oa.ansimov;

import java.io.File;
import java.io.IOException;

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
		
		
		String path_dir = "/home/alex/Oracle_Academy/workspace/ImageUploader/WebContent/";
		String namePathOfImages = path_dir + "saved_image";
		File saveDir = new File(namePathOfImages);
		if (!saveDir.exists()) {
			saveDir.mkdir();
		}		
			System.out.println(saveDir.exists());		
			
		Part part = request.getPart("fileImg");
		String fileName = part.getSubmittedFileName();
		String picturePath = namePathOfImages + File.separator + fileName;
		part.write(picturePath);
		/*String df = "dfvdf";
		request.setAttribute("path", df);*/
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/uploader.jsp");
		dispatcher.forward(request, response);
			
	
	}

}









