package paquete;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{	
			System.out.println("Aun Estas en el ciclo");
			if(i == 4)
			{
				break; //fin de ciclo // continue sigue el ciclo
			}
			
		
			System.out.println("El valor de i es: " +i);
		}
		System.out.println("Has dejado el ciclo for");
		
	}

}
