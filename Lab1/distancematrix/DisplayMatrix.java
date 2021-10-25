/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DisplayMatrix.java
 *
 * Created on Oct 8, 2012, 3:21:09 PM
 */
package distancematrix;

/**
 *
 * @author anders
 */
public class DisplayMatrix extends javax.swing.JFrame {

    public DisplayMatrix(Matrix matrix) {
		this.matrix = matrix;
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField(10);
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField(10);
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField(10);
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("x-coord");
        jLabel2.setText("y-coord");
        jLabel3.setText("name");

        jButton1.setText("Enter new point!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));
        jPanel3.setPreferredSize(new java.awt.Dimension(600,600));
        jPanel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.black));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		double x, y;
		String name;
		try {
    	    x = Double.parseDouble( jTextField1.getText() );
    	    y = Double.parseDouble( jTextField2.getText() );
			name = jTextField3.getText();
			if (name == "") throw new RuntimeException();
    	}
    	catch ( NumberFormatException e ) {
    	    jLabel4.setText( "Wrong coordinate format" );
    	    return;
    	}
    	catch ( RuntimeException e ) {
    	    jLabel4.setText( "Please enter a name" );
    	    return;
    	}
	
		matrix.addCity( x, y, name );
		matrix.createDistanceMatrix();
		int n = matrix.getNoOfCities();
        jPanel3.removeAll();
    	jPanel3.setLayout( new java.awt.GridLayout( n+1, n+1 ) );
		panels = new javax.swing.JPanel[n+1][n+1];
		labels = new javax.swing.JLabel[n+1][n+1];

		for ( int i = 0; i <= n; ++i )
			for ( int j = 0; j <= n; ++j ) {
				labels[i][j] = new javax.swing.JLabel();
				labels[i][j].setAlignmentX( java.awt.Component.CENTER_ALIGNMENT );

				panels[i][j] = new javax.swing.JPanel();
				panels[i][j].setBorder( new javax.swing.border.LineBorder( java.awt.Color.black ) );
				panels[i][j].setLayout( new java.awt.GridBagLayout() );
				//panels[i][j], javax.swing.BoxLayout.PAGE_AXIS));

				panels[i][j].add( labels[i][j], new java.awt.GridBagConstraints() );
				jPanel3.add( panels[i][j] );
			}

		for ( int i = 1; i <= n; ++i ) {
			labels[0][i].setText( matrix.getCityName( i-1 ) );
			labels[i][0].setText( matrix.getCityName( i-1 ) );
		}
		for ( int i = 1; i <= n; ++i )
			for ( int j = 1; j <= n; ++j )
				labels[i][j].setText( String.format( "%.3g%n", matrix.getDistance( i-1, j-1 ) ) );

		jLabel4.setText( "" );
		jTextField1.setText( "" );
		jTextField2.setText( "" );
		jTextField3.setText( "" );
		pack();
	}

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
	private Matrix matrix;
	private javax.swing.JPanel[][] panels;
    private javax.swing.JLabel[][] labels;
}
