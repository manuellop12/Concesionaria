
     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;
   import java.util.Scanner;
/**
 *
 * @author victor lopez 
 */
public class Concesionaria {

    private static int n1;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner (System.in);
        Scanner an =  new Scanner (System.in);
         float Coupe = (float) 19350.00;
        float CoupeDeportivo = (float) 24100.00;        
        float Compacto = (float) 16190.00;
        float Hatchback = (float) 20150.00;
        float EconomicoversionRally = (float) 34700.00;
        
        //SELECCION DE AMENIDADES
        float Manual = (float) 00.00;
        float CVT = (float) 800.00;
        float ManualconTurbo = (float) 00.00;
        float CVTconTurbo = (float) 800.00;

        
        //COLOR DE PINTURA EXTERIOR
        float CosmicBlue = (float) 00.00;
        float BurgundyNight = (float) 00.00;
        float RallyeRed = (float) 00.00;
        float CrystalBlack = (float) 00.00;
        float ModernSteel = (float) 00.00;
        float TaffetaWhite = (float) 00.00;
        float EnergyGreen = (float) 00.00;
        float KonaCoffee = (float) 00.00;
        float OrangeFury = (float) 00.00;
        float HeliosYellow = (float) 00.00;
        float SonicGray = (float) 00.00;
        float PolishedMetal = (float) 00.00;
        
        //COLOR DE TAPICERIA 
        float GrayCloth = (float) 00.00;
        float BlackCloth = (float) 00.00;        
        float BlackGrayCloth = (float) 00.00;        
        float RedBlackSuedeEffectFabric = (float) 00.00;        
        
        //AROS
        float Pulgadas_15 = (float) 00.00;
        float Pulgadas_16 = (float) 00.00;        
        float Pulgadas_17 = (float) 1688.00;
        float Pulgadas_18 = (float) 1700.00;
        float Pulgadas_19 = (float) 3011.00;
        
        //ACCESORIOS EXTERIORES
        
        float BodySideMolding = (float) 217.00;
        float CarCover = (float) 230.00;
        float DecklidSpoiler = (float) 299.99;
        float DoorEdgeFilm = (float) 42.00;
        float DoorEdgeGuards = (float) 84.00;
        float DoorTrimChrome = (float) 285.00;
        float DoorVisor = (float) 185.00;
        float FrontFenderEmblems = (float) 50.00;
        float RearBumperApplique = (float) 70.00;
        float FoglLghts = (float) 325.00;
        float NoseMascs = (float) 158.00;
        float MoonrofVisor = (float) 135.00;
        float SplashGuardSet = (float) 104.00;
        float DustCover = (float) 350.00;
        float DoorMirrorCoverCarbonFiber = (float) 520.00;     
        
        //ACCESORIOS INTERIORES
        float AllSeasonsFloorMats = (float) 142.00;
        float AutomaticDimmingMirror = (float) 219.00;
        float CargoHook = (float) 12.00;
        float CargoNet = (float) 49.00;
        float ConsoleIllumination = (float) 250.00;
        float CargoOrganizer = (float) 87.00;
        float DoorPanelProtector = (float) 149.00;
        float ArmrestCompartiment = (float) 337.00;
        float DoorSillTrimIlluminated = (float) 290.00;
        float CargoCover = (float) 350.00;
        float CargoLiner = (float) 187.00;
        
        
        //ACCESORIOS ELECTRICOS
        float WirelessPhoneCharger = (float) 305.00;
        float USBCharger_2_1_Amp = (float) 120.00;
        float PuddleLight = (float) 185.00;
        float ParkingSensors = (float) 514.00;       float precio;
        float SedanEconomico = (float) 18940.00;
        float Sedan = (float) 23570.00;
        float Deportivo = (float) 4100.00;
        float Hibrido = (float) 25100.00;

        
        
        
        
        
  
         
        boolean salir = false;
        int opcion = (0);
        
          
           while (!salir) {  
       System.out.println("-----------------------------------");
       System.out.println("BIENVENIDOS A CONCESIONARIA");
       System.out.println("SELECIONAR UNA OPCION ");
       System.out.println("1.Seleccionar vehiculo");
        System.out.println("2.Salir ");
        System.out.println("----------------------------------");
     
       int regresar = consola.nextInt();
       switch (regresar){
           case 1:{ 
           } System.out.println("GAMA DE AUTOMOVIL");
           System.out.println("-----------------------------------");
           System.out.println(" 1 SEDAN ECONOMICO---------PRECIO   18,940");
           System.out.println(" 2 SEDAN ------------------PRECIO   23,570");
           System.out.println(" 3 DEPORTIVO---------------PRECIO   24,100");
           System.out.println(" 4 HIBRIDO-----------------PRECIO   25,100");
           System.out.println(" 5 COUPE-------------------PRECIO   19,350");
           System.out.println(" 6 COUPE DEPORTIVO---------PRECIO   24,100");
           System.out.println(" 7 COMPACTO----------------PRECIO   16,190");
           System.out.println(" 8 HATCHBACK---------------PRECIO   20,150");
           System.out.println(" 9 ECONOMICO VERSION RALLY-PRECIO   34,700");
           System.out.println(" 10 Regresar menu principal");
           System.out.println("Seleccione selecione su Vehiculo");
           System.out.println("------------------------------------");
           break;
           
           case 2:
               System.out.println("Usted ha cerrado seccion con exito");
               System.exit(0);
               break;
               
               
           default:
               System.exit(0);
            
          } 
       int carro = consola.nextInt();
       switch (carro){
       case 1:
           
  System.out.println("Usted ha seleccionado SEDAN ECONOMICO     18,940");
  System.out.println("Desea agregar una amenidad 1 = si. 2 = no ");
    int bueno = consola.nextInt();
    switch (bueno){
    case 1:
        System.out.println("Ustede ha seleccionado que si");
        System.out.println("--------------------------------");
        System.out.println("AMENIDADES");
        
                   
                   
           System.out.println("1. Tipo de transmicion");
           System.out.println("2. Color de pintura exterior");
           System.out.println("3. Accesorios exteriores " );
           System.out.println("4. Accesorios interiores");
           System.out.println("5. Color de tapiseria");
           System.out.println("6. Aros");
           System.out.println("7. Accesorios Electricos");
           System.out.println("8. regresar a menu principal");
                         
             int dar =consola.nextInt();
             switch (dar){
             case 1:
                 System.out.println("Tipo de TRASMISION");
                 System.out.println(" 1.MANUAL              0");
                 System.out.println(" 2.CVT               800");
                 System.out.println(" 3.MANUAL CON TURBO     0");
                 System.out.println(" 4.CVT CON TURBO      800");
                 System.out.println(" 5.Regresar al menu principal");
                 break;}
                 
                 int  exterior = consola.nextInt();
                 switch (exterior) {     
              case 1:
                 float total = (float) (Manual + SedanEconomico);
                  System.out.println(" Usted ha  seleccionado   ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         Tipo de Trasmision Manual ");
                   System.out.println("Su total es de.      "+ total);
                   break; } 
                   
                   int pre = consola.nextInt();
                 switch (pre) {     
              case 2:
                 float cos = (float) (CVT + SedanEconomico );
                  System.out.println("Usted ha  seleccionado  ");
                   System.out.println("Su vehiculo es un.Sedan ");
                   System.out.println("Amenidades         Tipo de Trasmision CVT ");
                   System.out.println("Su total es de.      "+ cos);
                   break; }
                 
                 
           int rum = consola.nextInt();
                 switch (rum) {     
              case 3:
                 float tag = (float) (ManualconTurbo + SedanEconomico );
                  System.out.println("Usted han seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         Tipo de Trasmision ManualconTurbo  ");
                   System.out.println("Su total es de.      "+ tag);
                   break; }
                   
                   
                 
                 int  INTERIOR = consola.nextInt();
                 switch (INTERIOR) {     
              case 4:
                 float bam = (float) (CVTconTurbo + SedanEconomico);
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         Tipo de Trasmision CVTconTurbo  ");
                   System.out.println("Su total es de.      "+ bam);
                   break; }
                  
                 int col =consola.nextInt();
                  switch (col){
                      case 2:
                          
                        System.out.println("--------------------------");
                        System.out.println("Color DE Pintura Exterior");
                        System.out.println("----------------------------");
                        System.out.println(" 1. Cosmic Blue                  0.00");
                        System.out.println(" 2. Burgundy Night               0.00");
                        System.out.println(" 3. Rallye Red                   0.00");
                        System.out.println(" 4. Crystal Black                o.00");
                        System.out.println(" 5. Modern Steel                 0.00");
                        System.out.println(" 6. Taffeta White                0.00");
                        System.out.println(" 7. Energy Green                 0.00");
                        System.out.println(" 8. Kona Coffee                  0.00");
                        System.out.println(" 9. Orange Fury                  0.00");
                        System.out.println(" 10.Helios Yellow                0.00");
                        System.out.println("11. Sonic Gray                   0.00");
                        System.out.println("12. Polished Metal               0.00");
                        System.out.println("13. Regresar a menu Principal    0.00");
                        break;}
                            int  red = consola.nextInt();
                 switch (red) {     
              case 1:
                 float som = (float) (CosmicBlue + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior CosmicBlue ");
                   System.out.println("Su total es de.      "+ som);
                   break; }
                 
                  
                 
                             int yello = consola.nextInt();
                 switch (yello) {     
              case 2:
                 float cum = (float) (BurgundyNight + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior BurgundyNight ");
                   System.out.println("Su total es de.      "+ cum);
                   break; }
                 
                 
                 
                 
                               int  blue = consola.nextInt();
                 switch (blue) {     
              case 3:
                 float vas = (float) (RallyeRed+ SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior RallyeRed ");
                   System.out.println("Su total es de.      "+ vas);
                   break; }
                 
                 
                                int black = consola.nextInt();
                 switch (black) {     
              case 4:
                 float zum = (float) ( CrystalBlack + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior  CrystalBlack ");
                   System.out.println("Su total es de.      "+ zum);
                   break; }
                 
                 
                                int  hello = consola.nextInt();
                 switch (hello) {     
              case 5:
                 float sap = (float) (ModernSteel  + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior ModernSteel ");
                   System.out.println("Su total es de.      "+ sap);
                   break; }
                 
                 
                                int  cub = consola.nextInt();
                 switch (cub) {     
              case 6:
                 float lam = (float) ( TaffetaWhite + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior  TaffetaWhite ");
                   System.out.println("Su total es de.      "+ lam);
                   break; }
                 
                 
                                int timon = consola.nextInt();
                 switch (timon) {     
              case 7:
                 float sol = (float) ( EnergyGreen + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior  EnergyGreen ");
                   System.out.println("Su total es de.      "+ sol);
                   break; }
                 
                 
                                int grem = consola.nextInt();
                 switch (grem) {     
              case 8:
                 float gas = (float) (KonaCoffee + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior  KonaCoffee");
                   System.out.println("Su total es de.      "+ gas);
                   break; }
                 
                 
                                int  cafe = consola.nextInt();
                 switch (cafe) {     
              case 9:
                 float it = (float) ( OrangeFury+ SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior OrangeFury ");
                   System.out.println("Su total es de.      "+ it);
                   break; }
                 
                 
                                int one = consola.nextInt();
                 switch (one) {     
              case 10:
                 float dt = (float) (HeliosYellow + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior HeliosYellow ");
                   System.out.println("Su total es de.      "+ dt);
                   break; }
                 
                 
                                int  lam = consola.nextInt();
                 switch (lam) {     
              case 11:
                 float dc = (float) (SonicGray+ SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior SonicGray  ");
                   System.out.println("Su total es de.      "+ dc);
                   break; }
                 
                 
                                int  = consola.nextInt();
                 switch (red) {     
              case 12:
                 float som = (float) (CosmicBlue + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior CosmicBlue ");
                   System.out.println("Su total es de.      "+ som);
                   break; }
                 
                 
                                int  red = consola.nextInt();
                 switch (red) {     
              case 13:
                 float som = (float) (CosmicBlue + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior CosmicBlue ");
                   System.out.println("Su total es de.      "+ som);
                   break; }
                 
                 
                                int  red = consola.nextInt();
                 switch (red) {     
              case 14:
                 float som = (float) (CosmicBlue + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior CosmicBlue ");
                   System.out.println("Su total es de.      "+ som);
                   break; }
                 
                 
                                int  red = consola.nextInt();
                 switch (red) {     
              case 15:
                 float som = (float) (CosmicBlue + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior CosmicBlue ");
                   System.out.println("Su total es de.      "+ som);
                   break; }
                 
                 
                                int  red = consola.nextInt();
                 switch (red) {     
              case 1:
                 float som = (float) (CosmicBlue + SedanEconomico);
            
                  System.out.println("Usted ha  seleccionado ");
                   System.out.println("Su vehiculo es un.Sedan Economico ");
                   System.out.println("Amenidades         color de pintura exterior CosmicBlue ");
                   System.out.println("Su total es de.      "+ som);
                   break; }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                          
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                            
                int color = consola.nextInt();
                 switch (color){
               case 3:
                   
                       System.out.println("----------------------------------");
                       System.out.println("Accesorios Exteriores");
                       System.out.println("--------------------------------");
                       System.out.println("1.Body Side Molding         217.00");
                       System.out.println("2.Car Cover                 230.00");
                      System.out.println("3.Decklid Spoiler            299.99");
                      System.out.println("4.Door Edge Film              42.00");
                      System.out.println("5.Door Edge Guards           84.00 ");
                      System.out.println("6.Door Trim chrome          285..00");
                      System.out.println("7.Door Visor                 185.00");
                      System.out.println("8.Front Fender Emblems        50.00");
                      System.out.println("9.Rear Bumper Applique        70.00");
                      System.out.println("10.Fog Lights                 325.00");
                      System.out.println("11.Nose Mascs                 158.00");
                      System.out.println("12.Moonrof Visor              138.00");
                      System.out.println("13.Splash Guard set           104.00");
                     System.out.println("14.Dust Cover                  350.00");
                    System.out.println("15.Door Mirror cover fiber      520.00");
                    System.out.println("16. Salir");
                    
                     int elec = consola.nextInt();
                 switch (elec){
               case 4:
                   
                    System.out.println("---------------------------");
                    System.out.println("Accesorios Interiores Precio $");
                    System.out.println("----------------------------");
                     System.out.println("1. all-seasons Floor M.     142");
                     System.out.println("2. Automatic D.M.           219");
                     System.out.println("3. Cargo Hook               12.00");
                    System.out.println("4. Cargo Net                 49.00");
                    System.out.println("5. Console Illumination      250.00");
                    System.out.println("6. Cargo Organizar           87.00 ");                                                                                          
                    System.out.println("7. Door Panel                149.00");                                                                                                     
                   System.out.println("8. Armrest Comparti           337.00");
                  System.out.println("9.  Door Sill T. I.            290.00");
                 System.out.println("10. Cargo Cover                  166.00");
                  System.out.println("11. Cargo Liner                187.00");
               System.out.println("12.  salir");
               
               
                         int son = consola.nextInt();
                 switch (son){
               case 5:

System.out.println("----------------------------------");
 System.out.println(" Color de Tapiceria     precio $");
  System.out.println("_____________________________________");
   System.out.println("1. Gray Cloth                  0.00");
   System.out.println("2. Black Cloth                 0.00");
   System.out.println("3. Black Gray Cloth               0.00");
   System.out.println("4. Red Black                     0.00 ");
   System.out.println("5. SALIR");
   
   


                         int ABC = consola.nextInt();
                 switch (ABC){
               case 6:
                   System.out.println("AROS");
                   System.out.println("1.15       0.00");
                   System.out.println("2.16       0.00");
                   System.out.println("3. 17      1.688.00");
                   System.out.println("4. 18      1,700.00  ");
                   System.out.println("5. 19      3,011.00");
                   System.out.println("Salir");
                   
                            int cde = consola.nextInt();
                 switch (cde){
               case 6:
                   System.out.println("------------------------------");
                   System.out.println("Accesorios Electronicos    $");
                   System.out.println("-------------------------------");
                   System.out.println("WIRELESS           305.00");
                   System.out.println("Usb Charger         120.00");
                   System.out.println("Puddle light         185.00");
                   System.out.println("Parking Sensors       514.00");
                   System.out.println("Salir");
                   
                
                         int FGH = consola.nextInt();
                 switch (FGH){
               case 7:                                           
                    System.out.println("Regresar al Menu Pricipal");

                  
                            }
                   break;
               case 2:
                   System.out.println("Usted  selecciono no ");
                   System.out.println("Su vehiculo es un.Sedan Economico");
                   System.out.println("Amenidades         ninguna ");
                   System.out.println("Su total es de.      18,940");
                   break;
           }
             
           salir = true;
           break;
         
       case 2:
           System.out.println("Usted ha selecciono SEDAN             23,570");
           System.out.println("Desea agregar una amenidad 1 = si. 2 = no ");
           int bien = consola.nextInt();
           switch (bien){
               case 1:
                   System.out.println("Ustede ha seleccionado que si");
                   break;
               case 2:
                   System.out.println("Usted  selecciono no ");
                   System.out.println("Su vehiculo es un.Sedan ");
                   System.out.println("Amenidades         ninguna ");
                   System.out.println("Su total es de.      23,570");
                   
                   break;
           
           } 
           salir = true;
           break;
       case 3: 
           System.out.println("Usted ha seleccionado DEPORTIVO         24,100");
           salir = true;
           break;
       case 4:
           System.out.println("Usted ha seleccionado HIBRIDO           25,100");
           salir = true;
           break;
       case 5:
           System.out.println("Usted ha seleccionado COUPE             19,350");
           salir = true;
           break;
       case 6:
               System.out.println("Usted ha seleccionado COUPE DEPORTIVO 24,100");
               salir = true;
               break;
       case 7:
               System.out.println("Usted ha seleccionado COMPACTO       16,190");
               salir = true;
               break;
       case 8:
           System.out.println("Usted ha seleccionado HATCHBACK          20,150");
           salir = true;
           break;
       case 9:
           System.out.println("Usted ha seleccionado VERSION RALLY      34,700");
           salir = true;
           break;
       case 10:
           System.out.println("Regresar al menu principal");
           break;
                 
           
           
               
       
       
       
       
       
       }
       
       
       
       }
    }
}
                  }
             