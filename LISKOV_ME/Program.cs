using System;
using System.Collections.Generic;


class Program
{
    public static void Main()
    {
        Console.WriteLine("ingresa usuario");
        string usuario = Console.ReadLine();

        Console.WriteLine("ingresa su contraseña");
        string contraseña = Console.ReadLine();

        Sesion sesion = new Sesion(usuario,contraseña);

        if(!sesion.IniciarSesion())
        {
            Console.WriteLine("Inicio de sesion fallido, Hasta luego");
            return;
        }

        Console.WriteLine("Inicio de sesion existoso :)");
        SistemasDeCitas sistema = new SistemasDeCitas();


        while(true)
        {
            Console.WriteLine("Menu del sistema de citas");
            Console.WriteLine("1) Agendar cita en en SPA");
            Console.WriteLine("2) Agendar cita en linea");
            Console.WriteLine("3) Procesar citas");
            Console.WriteLine("4) Salir");
            Console.WriteLine("Seleccione una opcion: ");
             
            string? opcion = Console.ReadLine();


            switch(opcion)
            {
                case "1": 
                    Console.Write("Ingrese el nombre del cliente: ");
                    string clienteSpa = Console.ReadLine();
                    Console.Write("Ingrese el servicio solicitado: ");
                    string servicioSpa = Console.ReadLine();
                    Console.Write("Ingresa la fecha y hora ejem: 2004-09-24 14:00:   ");
                    DateTime fechaHoraSpa = DateTime.Parse(Console.ReadLine());


                    CitaEnSpa citaSpa = new CitaEnSpa
                    {
                        Cliente = clienteSpa,
                        Servicio = servicioSpa,
                        FechaHora = fechaHoraSpa
                    };

                    sistema.AgregarCIta(citaSpa);
                    Console.WriteLine($"Cita en el spa para {clienteSpa} agendada. \n");
                ;break;


                case "2": 
                    Console.Write("Ingrese el nombre del cliente: ");
                    string clienteEnLinea = Console.ReadLine();
                    Console.Write("Ingrese el servicio solicitado: ");
                    string servicioEnLinea = Console.ReadLine();
                    Console.Write("Ingresa la fecha y hora ejem: 2004-09-24 14:00:   ");
                    DateTime fechaHoraEnLinea = DateTime.Parse(Console.ReadLine());


                    CitaEnSpa citaEnLinea = new CitaEnSpa
                    {
                        Cliente = clienteEnLinea,
                        Servicio = servicioEnLinea,
                        FechaHora = fechaHoraEnLinea
                    };
                    sistema.AgregarCIta(citaEnLinea);
                    Console.WriteLine($"Cita en liena para {citaEnLinea} agendada. \n");
                ;break;

                case "3":
                    Console.WriteLine("Procesando citas... \n");
                    sistema.ProcesarCitas();
                    Console.WriteLine("Todas las citas hac sido procesadas. \n");
                ;break;
                    
                case "4":
                    Console.WriteLine("Saliendo del programa...");
                ;break;
                default: 
                    Console.WriteLine("opcion no valida, intente nuevamente. \n");
                ;break;



            }


        }




    }
}