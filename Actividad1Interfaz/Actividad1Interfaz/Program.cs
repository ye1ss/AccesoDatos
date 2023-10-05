// See https://aka.ms/new-console-template for more information



Console.Clear();
Console.ForegroundColor = ConsoleColor.Blue;
Console.WriteLine("                                       [--]----------------------------------[--]");
Console.WriteLine("(\"`-''-/\").___..--''\"`-._"+ "              [--]Creado por: Yeismil               [--]");
Console.WriteLine("`6_ 6  )   `-.  (     ).`-.__.`)"+ "       [--]Versión: 1.0                      [--]");
Console.WriteLine("(_Y_.)'  ._   )  `._ `. ``-..-'"+ "        [--]Nombre clave: Actividad1 Interfaz [--]");
Console.WriteLine("_..`--'_..-_/  /--'_.' ,'"+ "              [--]Sigeme en GitHub: ye1ss           [--]");
Console.WriteLine("(il),-''(li),'  ((!.-'"+ "                 [--]----------------------------------[--]");
Console.WriteLine(" ");
Console.WriteLine("Elige que quieres hacer:\n 1.Vocales\n 2.Números\n 3.Semanas\n 4.Tabla multiplicar");
String operacion= Console.ReadLine();

    switch (operacion)
    {
        case "1":
            Console.WriteLine("Escribeme una frase y te dire cuantas vocales tiene: ");
            String frase = Console.ReadLine();
            int contador = 0;
            string vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
            foreach (char letra in frase)
            {
                if (vocales.Contains(letra))
                {
                    contador++;
                }
            }
            Console.WriteLine("Número de vocales en la frase: " + contador);
            break;
        case "2":
            Console.WriteLine("Números impares del 0-100");
            int contadorImpares = 0;
            for (int i = 1; i <= 100; i++)
            {
                Console.WriteLine(i);

                if (i % 2 != 0) // Si el número es impar
                {
                    contadorImpares++;
                }
            }
            Console.WriteLine("Cantidad de números impares: " + contadorImpares);
            break;
        case "3":
            Console.WriteLine("Dime un dia de la semana y te dire si es fin de semana o no: ");
            String fraseSemana = Console.ReadLine();
            if (fraseSemana == "Lunes" || fraseSemana == "Martes" || fraseSemana == "Miércoles" || fraseSemana == "Miercoles" || fraseSemana == "Jueves" || fraseSemana == "Viernes" || fraseSemana == "lunes" || fraseSemana == "martes" || fraseSemana == "miercoles" || fraseSemana == "miércoles" || fraseSemana == "Miercoles" || fraseSemana == "jueves" || fraseSemana == "viernes")
            {
                Console.WriteLine("Es día de semana");
            }
            else if (fraseSemana == "Sabado" || fraseSemana == "Domingo" || fraseSemana == "sábado" || fraseSemana == "domingo" || fraseSemana == "sabado")
            {
                Console.WriteLine("Es fin de semana");
            }
            else
            {
                Console.WriteLine("Error. Escribe un dia de la semana válido");
            }
            break;
        case "4":
            Console.WriteLine("Dime un número y te diré su tabla de multiplicar: ");
            int num = int.Parse(Console.ReadLine());
            for (int i = 1; i <= 10; i++)
            {
                int resultado = num * i;
                Console.WriteLine($"{num} x {i} = {resultado}");
            }

            Console.WriteLine("Pulsa cualquier tecla para cerrar");
            Console.ReadKey();
            break;
        }     


