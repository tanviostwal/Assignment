/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanvi
 */
import java.util.*;

class Drone
{
	public static void main(String args[])
	{
		int option, id = 0;
		Scanner s = new Scanner(System.in);
		int delivery_id_confirmation[] = new int[2002];
		int check[] = new int[1001];
		int count = 0;
		while (true)
		{
			System.out.println("1 Take-off or Return\n2 Exit");
			option = s.nextInt();
			if (option == 2)
				break;
                        if(option==1)
                        {
                            System.out.print("Drone id ?");
                            id = s.nextInt();
                            delivery_id_confirmation[count++] = id;
                        }
                        else
                            System.out.println("Invalid Input.");
                }
		for (id = 1; id < count; id++)
		{
			//System.out.print(delivery_id_confirmation[id] + " ");
			check[delivery_id_confirmation[id]]++;
		}
		System.out.println();
		for (id = 1; id <= 1000; id++)
			if (check[id] == 1)
				break;
		System.out.println("\nMissing drone is " + id);
	}
}
