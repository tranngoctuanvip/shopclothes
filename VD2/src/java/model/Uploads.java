package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Tran Manh Truong
 */
public class Uploads {
    public static String filePath="";
    public static List getFieldItems(HttpServletRequest request, String Folder)
    {
      int maxFileSize = 5000 * 1024;
      int maxMemSize = 5000 * 1024;
      ServletContext context = request.getServletContext();
      String curPath = context.getRealPath("/");
      filePath = curPath + Folder ;//thư mục chứa file upload từ trình duyệt lên
      DiskFileItemFactory factory = new DiskFileItemFactory();
      factory.setSizeThreshold(maxMemSize);
      factory.setRepository(new File(curPath));
      ServletFileUpload upload = new ServletFileUpload(factory);
      upload.setSizeMax( maxFileSize );
      List FieldItems=null;
        try {
            FieldItems = upload.parseRequest(request);
        } catch (FileUploadException ex) {
            Logger.getLogger(Uploads.class.getName()).log(Level.SEVERE, null, ex);
        }
      return FieldItems;
    }
    public static String getInput(List fieldItems,String inputName) throws Exception
    {
        Iterator i = fieldItems.iterator();
        while ( i.hasNext () )  //lặp các input submit từ form
        {
            FileItem fi = (FileItem)i.next();
            String fieldName = fi.getFieldName();
            if(fieldName.equalsIgnoreCase(inputName)){
                if ( fi.isFormField () ) //nếu là input thường
                {
                    return fi.getString("UTF-8");
                }
                else //nếu là input dạng file
                {
                    String fileName = fi.getName();
                    //boolean isInMemory = fi.isInMemory();
                    //long sizeInBytes = fi.getSize();
                    if(fileName.equals("")==false)
                    {
                        File file = new File( filePath + fileName) ;
                        fi.write( file ) ;
                    }
                    return fileName;
                }
            }
        }
        return "";
    }

    public static String getInput(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
