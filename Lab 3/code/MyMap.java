import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World world;

    public MyMap() {
        initComponents();
        //Creamos 3 Regiones con distintos puntos para generar el primer continente

        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add( new Point( 10, 100) );
        points1.add( new Point( 150, 10) );
        points1.add( new Point( 290, 100) );
        points1.add( new Point( 290, 200 ) );
        points1.add( new Point( 150, 290 ) );
        points1.add( new Point( 10, 200 ) );
        //Creamos varias ciudades para el primer pais de Europa
        City Madrid = new City(100, 100, "Madrid", 3223);
        City Barcelona = new City(200, 150, "Barcelona",1622);
        City Cadiz = new City (50, 200, "Cadiz", 166);
        
        //Creamos dos lagos para el pais
        LinkedList< Point > Lake1= new LinkedList< Point >();
        Lake1.add(new Point(100, 50));  
        Lake1.add(new Point(150, 50)); 
        Lake1.add(new Point(125, 75));
        Lake CasaDeCampo = new Lake(Lake1);

        LinkedList< Point > Lake2= new LinkedList< Point >();
        Lake2.add(new Point(180, 180));  
        Lake2.add(new Point(120, 120)); 
        Lake2.add(new Point(120, 200));
        Lake Ciutadella = new Lake(Lake2);

        //Creamos la lista conde almazenar los lagos del pais
        LinkedList<Lake> LakeEsp = new LinkedList<Lake>();
        LakeEsp.add(CasaDeCampo);
        LakeEsp.add(Ciutadella);

        //Creamos el pais y añadimos las otras ciudades
        Country Spain = new Country(points1, Madrid,LakeEsp);
        Spain.addCity(Barcelona);
        Spain.addCity(Cadiz);
        System.out.println("Area España:"+Spain.getArea() );

        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 290, 200 ) );
        points2.add( new Point( 150, 290) );
        points2.add( new Point( 400, 290 ) );
        //Creamos varias ciudades del segundo pais de Europa
        City Oslo = new City(200, 280, "Oslo", 634);
        City Bergen = new City(300, 270, "Bergen", 271);

        //Creamos un lago para Noruega
        LinkedList< Point > Lake3= new LinkedList< Point >();
        Lake3.add(new Point(290, 200));  
        Lake3.add(new Point(310, 225)); 
        Lake3.add(new Point(190, 265));
        Lake Svanevatn = new Lake(Lake3);
        LinkedList<Lake> LakeNor = new LinkedList<Lake>();
        LakeNor.add(Svanevatn);

        //Creamos el pais Noruega y añadimos la otra ciudad
        Country Noruega = new Country( points2,Oslo, LakeNor);
        Noruega.addCity(Bergen);
        System.out.println("Area Noruega:"+Noruega.getArea());


        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 400, 290 ) );
        points3.add( new Point( 290, 200) );
        points3.add(new Point( 500, 150));

        //Creamos varias ciudades para el tercer pais de Europa
        City Atenas = new City(380, 195, "Atenas", 664);
        City Patres = new City(400, 230, "Patres", 167);

        //Creamos un lago para Grecia
        LinkedList< Point > Lake4= new LinkedList< Point >();
        Lake4.add(new Point(400, 290));  
        Lake4.add(new Point(400, 250)); 
        Lake4.add(new Point(320, 210));
        Lake Prespes = new Lake(Lake4);
        LinkedList<Lake> LakeGre = new LinkedList<Lake>();
        LakeGre.add(Prespes);

        //Creamos el pais Grecia y añadimos otra ciudad
        Country Grecia = new Country(points3, Atenas, LakeGre);
        Grecia.addCity(Patres);
        System.out.println("Area Grecia:"+Grecia.getArea() );

        //Creamos un continente a raiz de estas 3 regiones
        LinkedList< Country > cont1 = new LinkedList< Country>();
        cont1.add(Spain);
        cont1.add(Noruega);
        cont1.add(Grecia);
        Continent Europa = new Continent(cont1);
        System.out.println("Area Europa:"+Europa.getTotalArea() );
        
        //Creamos otras 3 regiones nuevas con distintos puntos para generar el segundo continente

        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 710, 800) );
        points4.add( new Point( 850, 710) );
        points4.add( new Point( 990, 800) );
        points4.add( new Point( 990, 900 ) );
        points4.add( new Point( 850, 990 ) );
        points4.add( new Point( 710, 900 ) );

        //Creamos varias ciudades para el primer pais de Asia
        City Pequín = new City(800, 800, "Pequín", 21540);
        City Shanghái = new City(920, 900, "Shangái", 26390);

        //Creamos un lago para China
        LinkedList< Point > Lake5= new LinkedList< Point >();
        Lake5.add(new Point(850, 715));  
        Lake5.add(new Point(715, 800)); 
        Lake5.add(new Point(715, 880));
        Lake Nur = new Lake(Lake5);
        LinkedList<Lake> LakeChi = new LinkedList<Lake>();
        LakeChi.add(Nur);

        //Creamos el pais China y añadimos otra ciudad
        Country China = new Country(points4, Pequín, LakeChi);
        China.addCity(Shanghái);
        System.out.println("Area China:"+China.getArea() );
        

        LinkedList< Point > points5 = new LinkedList< Point >();
        points5.add( new Point( 680, 990 ) );
        points5.add( new Point( 680, 800 ) );
        points5.add( new Point( 530, 875) );

        //Creamos varias ciudades para el segundo pais de Asia
        City Tokyo = new City(640, 875, "Tokyo", 13960);
        City Kyoto = new City(640, 840, "Kyoto", 1475);
        City Osaka = new City(640, 950, "Osaka", 2691);

        //Creamos un lago para Japon
        LinkedList< Point > Lake6= new LinkedList< Point >();
        Lake6.add(new Point(530, 875));  
        Lake6.add(new Point(580, 900)); 
        Lake6.add(new Point(620, 830));
        Lake Biwa = new Lake(Lake6);
        LinkedList<Lake> LakeJap = new LinkedList<Lake>();
        LakeJap.add(Biwa);

        //Creamos el pais Japon y añadimos dos ciudades
        Country Japon = new Country(points5, Tokyo, LakeJap);
        Japon.addCity(Kyoto);
        Japon.addCity(Osaka);
        System.out.println("Area Japon:"+Japon.getArea() );


        LinkedList< Point > points6 = new LinkedList< Point >();
        points6.add( new Point( 850, 710 ) );
        points6.add( new Point( 710, 800 ) );
        points6.add( new Point( 650, 750) );
        points6.add( new Point( 720, 600 ) );

        //Creamos varias ciudades para el tercer pais de Asia
        City Hanoi = new City(700, 650, "Hanoi", 6699);
        City Sapa = new City(700, 690, "Sapa", 145);

        //Creamos un lago para Vietnam
        LinkedList< Point > Lake7= new LinkedList< Point >();
        Lake7.add(new Point(650, 750));  
        Lake7.add(new Point(850, 710)); 
        Lake7.add(new Point(780, 675));
        Lake HoTai = new Lake(Lake7);
        LinkedList<Lake> LakeVie = new LinkedList<Lake>();
        LakeVie.add(HoTai);

        //Creamos el pais Vietnam y añadimos una ciudad
        Country Vietnam = new Country(points6, Hanoi, LakeVie);
        Vietnam.addCity(Sapa);
        System.out.println("Area Vietnam:"+Vietnam.getArea() );
        //Creamos un nuevo continente a raiz de las 3 nuevas regiones creadas

        LinkedList< Country > cont2 = new LinkedList< Country>();
        cont2.add(China);
        cont2.add(Japon);
        cont2.add(Vietnam);
        Continent Asia = new Continent( cont2);
        System.out.println("Area Asia:"+Asia.getTotalArea() );
        
        //Creamos otras 3 nuevas regiones para luego poder generar el ultimo continente

        LinkedList< Point > points7 = new LinkedList< Point >();
        points7.add( new Point( 710, 100) );
        points7.add( new Point( 850, 10) );
        points7.add( new Point( 990, 100) );
        points7.add( new Point( 990, 200 ) );
        points7.add( new Point( 850, 290 ) );
        points7.add( new Point( 710, 200 ) );

        //Creamos varias ciudades para el primer pais de América del Sur
        City CiudadDeMexico = new City(850, 100, "Ciudad de Mexico", 8855);
        City Guadalajara = new City(800, 150, "Guadalajara", 849);

        //Creamos un lago para Mexico
        LinkedList< Point > Lake8= new LinkedList< Point >();
        Lake8.add(new Point(710, 100));  
        Lake8.add(new Point(850, 10)); 
        Lake8.add(new Point(780, 150));
        Lake Yuriria = new Lake(Lake8);
        LinkedList<Lake> LakeMex = new LinkedList<Lake>();
        LakeMex.add(Yuriria);

        //Creamos el pais Mexico y añadimos una ciudad
        Country Mexico = new Country( points7, CiudadDeMexico, LakeMex);
        Mexico.addCity(Guadalajara);
        System.out.println("Area Mexico:"+Mexico.getArea() );


        LinkedList< Point > points8 = new LinkedList< Point >();
        points8.add( new Point( 850, 290 ) );
        points8.add( new Point( 710, 200) );
        points8.add( new Point( 850, 500 ) );

        //Creamos varias ciudades para el segundo pais de América del Sur
        City BuenosAires = new City(780, 320, "Buenos Aires", 2890);
        City Rosario = new City(780, 285, "Rosario", 992);

        //Creamos un lago para Argentina
        LinkedList< Point > Lake9= new LinkedList< Point >();
        Lake9.add(new Point(850, 360));  
        Lake9.add(new Point(850, 500)); 
        Lake9.add(new Point(800, 360));
        Lake Viedma = new Lake(Lake9);
        LinkedList<Lake> LakeArg = new LinkedList<Lake>();
        LakeArg.add(Viedma);

        //Creamos el pais Argentina y añadimos una ciudad
        Country Argentina= new Country(points8, BuenosAires, LakeArg);
        Argentina.addCity(Rosario);
        System.out.println("Area Argentina:"+Argentina.getArea() );


        LinkedList< Point > points9 = new LinkedList< Point >();
        points9.add( new Point( 710, 200 ) );
        points9.add( new Point( 850, 500) );
        points9.add(new Point(600, 380));
        points9.add( new Point( 550, 320));

        //Creamos varias ciuades para el tercer pais de América del Sur
        City Brasilia = new City(660, 250, "Brasilia", 3015);
        City Rio = new City(650, 340, "Rio de Janeiro", 674);

        //Creamos un lago para Brasil
        LinkedList< Point > Lake10= new LinkedList< Point >();
        Lake10.add(new Point(850, 500));  
        Lake10.add(new Point(730, 420)); 
        Lake10.add(new Point(820, 450));
        Lake Negro = new Lake(Lake10);
        LinkedList<Lake> LakeBra = new LinkedList<Lake>();
        LakeBra.add(Negro);

        //Creamos el pais Brasil y añadimos una ciudad
        Country Brasil = new Country(points9, Brasilia, LakeBra);
        Brasil.addCity(Rio);
        System.out.println("Area region 9:"+Brasil.getArea() );
        //Creamos el ultimo continente a raiz de las tres ultimas regiones

        LinkedList< Country > cont3 = new LinkedList< Country>();
        cont3.add(Mexico);
        cont3.add(Argentina);
        cont3.add(Brasil);
        Continent SurAmerica = new Continent( cont3);  
        System.out.println("Area América del Sur:"+SurAmerica.getTotalArea() );
             
       //Creamos el mundo gracias a los tres continentes
        LinkedList< Continent > world = new LinkedList< Continent>();
        world.add(Europa);
        world.add(Asia);
        world.add(SurAmerica);

        //Creamos Oceanos para crear el mundo
        LinkedList<Point> Ocean1 = new LinkedList<Point>();
        Ocean1.add(new Point(850, 500));
        Ocean1.add(new Point(600, 380));
        Ocean1.add(new Point(400, 700));
        Ocean Pacifico = new Ocean(Ocean1);

        LinkedList<Point> Ocean2 = new LinkedList<Point>();
        Ocean2.add(new Point(10,290));
        Ocean2.add(new Point(400, 290));
        Ocean2.add(new Point(400, 700));
        Ocean Atlantico = new Ocean(Ocean2);

        LinkedList<Point> Ocean3 = new LinkedList<Point>();
        Ocean3.add(new Point(10,990));
        Ocean3.add(new Point(600, 990));
        Ocean3.add(new Point(400, 700));
        Ocean Indico = new Ocean(Ocean3);        
        
        
        LinkedList<Ocean> Ocean = new LinkedList<Ocean>();
        Ocean.add(Pacifico); 
        Ocean.add(Atlantico);
        Ocean.add(Indico);

        this.world = new World(world, Ocean);
        

    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        world.draw( g );
    }

}

