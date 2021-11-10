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
        PolygonalRegion region1 = new PolygonalRegion( points1 );
        System.out.println("Area region 1:"+region1.getArea() );

        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 290, 200 ) );
        points2.add( new Point( 150, 290) );
        points2.add( new Point( 400, 290 ) );
        PolygonalRegion region2 = new PolygonalRegion( points2 );
        System.out.println("Area region 2:"+region2.getArea() );

        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 400, 290 ) );
        points3.add( new Point( 290, 200) );
        points3.add(new Point( 350, 150));
        PolygonalRegion region3 = new PolygonalRegion( points3 );
        System.out.println("Area region 3:"+region3.getArea() );
        //Creamos un continente a raiz de estas 3 regiones

        LinkedList< PolygonalRegion > cont1 = new LinkedList< PolygonalRegion>();
        cont1.add(region1);
        cont1.add(region2);
        cont1.add(region3);
        Continent continent1 = new Continent( cont1);
        System.out.println("Area continente 1:"+continent1.getTotalArea() );
        
        //Creamos otras 3 regiones nuevas con distintos puntos para generar el segundo continente

        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 710, 800) );
        points4.add( new Point( 850, 710) );
        points4.add( new Point( 990, 800) );
        points4.add( new Point( 990, 900 ) );
        points4.add( new Point( 850, 990 ) );
        points4.add( new Point( 710, 900 ) );
        PolygonalRegion region4 = new PolygonalRegion( points4 );
        System.out.println("Area region 4:"+region4.getArea() );
        
        LinkedList< Point > points5 = new LinkedList< Point >();
        points5.add( new Point( 850, 710 ) );
        points5.add( new Point( 710, 800 ) );
        points5.add( new Point( 650, 750) );
        PolygonalRegion region5 = new PolygonalRegion( points5 );
        System.out.println("Area region 5:"+region5.getArea() );

        LinkedList< Point > points6 = new LinkedList< Point >();
        points6.add( new Point( 850, 710 ) );
        points6.add( new Point( 650, 750 ) );
        points6.add( new Point( 650, 600));
        points6.add( new Point( 720, 600 ) );
        PolygonalRegion region6 = new PolygonalRegion( points6 );
        System.out.println("Area region 6:"+region6.getArea() );
        //Creamos un nuevo continente a raiz de las 3 nuevas regiones creadas

        LinkedList< PolygonalRegion > cont2 = new LinkedList< PolygonalRegion>();
        cont2.add(region4);
        cont2.add(region5);
        cont2.add(region6);
        Continent continent2 = new Continent( cont2);
        System.out.println("Area continente 2:"+continent2.getTotalArea() );
        
        //Creamos otras 3 nuevas regiones para luego poder generar el ultimo continente

        LinkedList< Point > points7 = new LinkedList< Point >();
        points7.add( new Point( 710, 100) );
        points7.add( new Point( 850, 10) );
        points7.add( new Point( 990, 100) );
        points7.add( new Point( 990, 200 ) );
        points7.add( new Point( 850, 290 ) );
        points7.add( new Point( 710, 200 ) );
        PolygonalRegion region7 = new PolygonalRegion( points7 );
        System.out.println("Area region 7:"+region7.getArea() );

        LinkedList< Point > points8 = new LinkedList< Point >();
        points8.add( new Point( 850, 290 ) );
        points8.add( new Point( 710, 200) );
        points8.add( new Point( 850, 500 ) );
        PolygonalRegion region8 = new PolygonalRegion( points8 );
        System.out.println("Area region 8:"+region8.getArea() );

        LinkedList< Point > points9 = new LinkedList< Point >();
        points9.add( new Point( 710, 200 ) );
        points9.add( new Point( 850, 500) );
        points9.add(new Point(600, 380));
        points9.add( new Point( 550, 320));
        PolygonalRegion region9 = new PolygonalRegion( points9 );
        System.out.println("Area region 9:"+region9.getArea() );
        //Creamos el ultimo continente a raiz de las tres ultimas regiones

        LinkedList< PolygonalRegion > cont3 = new LinkedList< PolygonalRegion>();
        cont3.add(region7);
        cont3.add(region8);
        cont3.add(region9);
        Continent continent3 = new Continent( cont3);  
        System.out.println("Area continente 3:"+continent3.getTotalArea() );
             
       
        LinkedList< Continent > world = new LinkedList< Continent>();
        world.add(continent1);
        world.add(continent2);
        world.add(continent3);

        this.world = new World(world);
        

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

