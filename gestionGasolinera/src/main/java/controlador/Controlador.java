/**
 * 
 */
package controlador;


/**
 * @author Pablo
 *
 */

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.*;
import dal.*;
import impl.*;

public class Controlador {
	
public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("contexto.xml");
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		Integer opcion1;
		ADtoServicio aDto = new ADtoServicioImpl();
		ADaoServicio aDao = new ADaoServicioImpl();
		do{
			System.out.println("#################");
			System.out.println("##### MENU ######");
			System.out.println("#################");
			System.out.println("1. Repostaje normal");
			System.out.println("2. Repostaje factura");
			System.out.println("3. Ver todos los repostajes");
			System.out.println("4. Importe total combustible vendido");
			System.out.println("5. Llenado de deposito");
			System.out.println("6. Eliminar ultimo llenado de deposito");
			System.out.println("7. Ver todos los llenados de deposito");		
			System.out.println("0. Cerrar menu.");
			System.out.println("");
			System.out.println("[INFO] - Escriba el numero de la opcion deseada: ");
		Scanner scan = new Scanner(System.in);
		opcion1 = scan.nextInt();
		Calendar fechaActual = Calendar.getInstance();
		
		System.out.println("");
		
		//DTO para el pago repostaje
		RepostajeGasolineraDTO DTO;
		RepostajeGasolinera repostajeGasolinera;
		
		
		
		switch (opcion1) {
		
		case 1:
		System.out.println("[INFO] - HAS ELEGIDO REPOSTAJE NORMAL");
		System.out.println("         Introduce el importe del repostaje: ");
		Scanner entradaImporteRepostaje = new Scanner(System.in);
		int importeRepostaje = entradaImporteRepostaje.nextInt();
		
		DTO = aDto.ARepostajeGasolineraDTONormal( fechaActual, importeRepostaje);
		repostajeGasolinera = aDao.RepostajeGasolineraNormalDTODAO(DTO);
		consulta.insertarRepostaje(repostajeGasolinera);
		break;
		
		
		
		case 2:
		System.out.println("Has escogido la opción de repostaje con pago con factura");

		break;
		
		
		case 3:
		System.out.println("Has escogido la opción de ver todos los repostajes");
		break;
		
		case 4:
		System.out.println("La suma de los repostajes es: "+ " euros");
		break;
		
		
		case 5:
		System.out.println("Has escogido la opción de llenar el depósito");
		break;
		
		
		case 6:
			
		break;
		
		
		case 7:
		System.out.println("Has escogido la opción de ver todos los llenados de depósito");
		break;
		
		
		default:
	
		}
		
		}while(opcion1 != 0);
	}

}
