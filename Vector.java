package practise;

	import java.util.Enumeration;
	import java.util.Vector;

	public class vector {
		public static void main(String args[]){    
			
			  Vector vc = new Vector (); 
			  
			  vc.add("Mark");  
			  vc.addElement("Kirby"); 
			  vc.addElement("Julia");  
			  
			  Enumeration enm = vc.elements(); 
			  
			  while(enm.hasMoreElements()){  
			   System.out.println(enm.nextElement());  
			  }  
        
			 }      
	
  }
  
