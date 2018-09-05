package mandelbrot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class MandelPanel_DS extends javax.swing.JPanel {

    private double ZOOM = 0.8;
    private double TRANS = 0.20;
    private double GROW = 1.25;
    private final ASCIIMandel am = new ASCIIMandel();
    private Color[] palette;
    private SimpleAttributeSet attrs[];
    private drawStringPanel graph = new drawStringPanel();

    /** Creates new form MandelPanel */
    public MandelPanel_DS() {
        initComponents();
        setPreferredSize(new Dimension(1000, 650));
        createPalette();
        panelMain.add(graph);
        
        // set PRECI so that output y:x ratio is correct
        am.PRECI = am.PRECR * ((double)graph.ySpacing / graph.xSpacing);
        changeView(1, 0, 0, am.ITERATIONS);
    }

    void updateGraph() {
        // For updating the display panel
        am.draw();
        graph.repaint();
        graph.updateSize();

        txtReRange.setText(String.format("%.6g", am.MAXR - am.MINR));
        txtImRange.setText(String.format("%.6g", am.MAXI - am.MINI));
        txtMinRe.setText(String.format("%.17g", am.MINR));
        txtMaxRe.setText(String.format("%.17g", am.MAXR));
        txtMinIm.setText(String.format("%.17g", am.MINI));
        txtMaxIm.setText(String.format("%.17g", am.MAXI));
        txtIterations.setText(String.valueOf(am.ITERATIONS));
        txtBucketSize.setText(String.valueOf(am.BUCKET));
        txtSizeCols.setText(String.valueOf(am.XCOLS));
        txtSizeRows.setText(String.valueOf(am.YROWS));
    }

    final void changeView(double zoom, double xTrans, double yTrans, int iter) {
        // For recalculating parameters on the model
        // Use local variables for calculation of new object values to avoid mixing altered and unaltered values
        final double maxi  = am.MAXI;
        final double mini  = am.MINI;
        final double maxr  = am.MAXR;
        final double minr  = am.MINR;
        final double preci = am.PRECI;
        final double precr = am.PRECR;
        final int    yrows = am.YROWS;
        final int    xcols = am.XCOLS;

        am.PRECI = preci * zoom;
        am.PRECR = precr * zoom;
        am.MINI = mini + (yrows * preci) * (1 - zoom) / 2 + yTrans * TRANS * (preci * yrows);
        am.MAXI = am.MINI + preci * yrows + yTrans * TRANS * (preci * yrows);
        am.MINR = minr + (xcols * precr) * (1 - zoom) / 2 + xTrans * TRANS * (precr * xcols);
        am.MAXR = am.MINR + precr * xcols + xTrans * TRANS * (precr * xcols);

        am.ITERATIONS = iter;
        updateGraph();
    }

    protected final void createPalette() {
        palette = new Color[13];

        palette[0] = new Color(220, 80, 220);
        palette[1] = new Color(20, 80, 20);
        palette[2] = new Color(40, 220, 40);
        palette[3] = new Color(60, 200, 200);
        palette[4] = new Color(80, 80, 80);
        palette[5] = new Color(100, 20, 100);
        palette[6] = new Color(120, 20, 20);
        palette[7] = new Color(140, 140, 0);
        palette[8] = new Color(240, 200, 60);
        palette[9] = new Color(240, 40, 20);
        palette[10] = new Color(200, 160, 160);
        palette[11] = new Color(140, 140, 220);
        palette[12] = new Color(0, 0, 0);
    }

    class drawStringPanel extends JPanel {

        private Color MONO_COLOR = new Color(215, 100, 0);
        private FontMetrics fm = getFontMetrics(am.FONT);
        private int ySpacing = fm.getHeight();
        private int xSpacing = fm.charWidth('#');
        private int yBorder = 0;
        private int xBorder = 5;

        public drawStringPanel() {
            setFont(am.FONT);
            setBackground(Color.BLACK);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(MONO_COLOR);

            for (int y = 0; y < am.YROWS; y++) {

                for (int x = 0; x < am.XCOLS; x++) {

                    int value = am.PIXELMAP[x][y];
                    if (chkBoxColour.isSelected()) {
                        g2.setColor(palette[value]);
                    }
                    int xOffset = xBorder + x * xSpacing;
                    int yOffset = yBorder + (y + 1) * ySpacing;
                    g2.drawString(String.valueOf(am.CHARS[value]), xOffset, yOffset);
//                    g2.fillOval(xOffset, yOffset, xSpacing-1, ySpacing-1);
                }
            }
        }

        public void updateSize() {
            // Set preferred size so that scrollbars are displayed correctly
            this.setPreferredSize(new Dimension(xBorder * 2 + xSpacing * am.XCOLS, yBorder * 2 + ySpacing * am.YROWS));
            this.revalidate();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        scrollPaneMain = new javax.swing.JScrollPane();
        panelMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelLower = new javax.swing.JPanel();
        panelControls = new javax.swing.JPanel();
        panelMove = new javax.swing.JPanel();
        btnLeft = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        panelSize = new javax.swing.JPanel();
        btnShrinkR = new javax.swing.JButton();
        btnShrinkI = new javax.swing.JButton();
        btnGrowR = new javax.swing.JButton();
        btnGrowI = new javax.swing.JButton();
        txtSizeCols = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSizeRows = new javax.swing.JTextField();
        panelDetail = new javax.swing.JPanel();
        btnDetailPlus = new javax.swing.JButton();
        btnDetailMinus = new javax.swing.JButton();
        txtIterations = new javax.swing.JTextField();
        btnBucketMinus = new javax.swing.JButton();
        btnBucketPlus = new javax.swing.JButton();
        txtBucketSize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelZoom = new javax.swing.JPanel();
        btnZoomIn = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        txtReRange = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtImRange = new javax.swing.JTextField();
        chkBoxColour = new javax.swing.JCheckBox();
        panelPositions = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMinRe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaxRe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMinIm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaxIm = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(941, 714));
        setLayout(new java.awt.BorderLayout());

        panelMain.setLayout(new java.awt.BorderLayout());
        scrollPaneMain.setViewportView(panelMain);

        add(scrollPaneMain, java.awt.BorderLayout.CENTER);

        jScrollPane1.setHorizontalScrollBar(null);

        panelLower.setFocusTraversalPolicyProvider(true);
        panelLower.setPreferredSize(new java.awt.Dimension(900, 150));
        panelLower.setLayout(new java.awt.GridBagLayout());

        panelControls.setMinimumSize(new java.awt.Dimension(780, 118));
        panelControls.setPreferredSize(new java.awt.Dimension(780, 185));
        panelControls.setLayout(new java.awt.GridBagLayout());

        panelMove.setBorder(javax.swing.BorderFactory.createTitledBorder("Move"));
        panelMove.setMinimumSize(new java.awt.Dimension(135, 118));
        panelMove.setPreferredSize(new java.awt.Dimension(135, 118));
        panelMove.setLayout(new java.awt.GridBagLayout());

        btnLeft.setText("˂");
        btnLeft.setMaximumSize(new java.awt.Dimension(41, 28));
        btnLeft.setMinimumSize(new java.awt.Dimension(41, 28));
        btnLeft.setPreferredSize(new java.awt.Dimension(41, 28));
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelMove.add(btnLeft, gridBagConstraints);

        btnUp.setText("˄");
        btnUp.setMaximumSize(new java.awt.Dimension(41, 28));
        btnUp.setMinimumSize(new java.awt.Dimension(41, 28));
        btnUp.setPreferredSize(new java.awt.Dimension(41, 28));
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelMove.add(btnUp, gridBagConstraints);

        btnRight.setText("˃");
        btnRight.setMaximumSize(new java.awt.Dimension(41, 28));
        btnRight.setMinimumSize(new java.awt.Dimension(41, 28));
        btnRight.setPreferredSize(new java.awt.Dimension(41, 28));
        btnRight.setRequestFocusEnabled(false);
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        panelMove.add(btnRight, gridBagConstraints);

        btnDown.setText("˅");
        btnDown.setMaximumSize(new java.awt.Dimension(41, 28));
        btnDown.setMinimumSize(new java.awt.Dimension(41, 28));
        btnDown.setPreferredSize(new java.awt.Dimension(41, 28));
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panelMove.add(btnDown, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelControls.add(panelMove, gridBagConstraints);

        panelSize.setBorder(javax.swing.BorderFactory.createTitledBorder("Size"));
        panelSize.setMinimumSize(new java.awt.Dimension(201, 118));
        panelSize.setPreferredSize(new java.awt.Dimension(201, 118));
        panelSize.setVerifyInputWhenFocusTarget(false);
        panelSize.setLayout(new java.awt.GridBagLayout());

        btnShrinkR.setText("-");
        btnShrinkR.setMaximumSize(new java.awt.Dimension(41, 28));
        btnShrinkR.setMinimumSize(new java.awt.Dimension(41, 28));
        btnShrinkR.setPreferredSize(new java.awt.Dimension(41, 28));
        btnShrinkR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShrinkRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelSize.add(btnShrinkR, gridBagConstraints);

        btnShrinkI.setText("-");
        btnShrinkI.setMaximumSize(new java.awt.Dimension(41, 28));
        btnShrinkI.setMinimumSize(new java.awt.Dimension(41, 28));
        btnShrinkI.setPreferredSize(new java.awt.Dimension(41, 28));
        btnShrinkI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShrinkIActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelSize.add(btnShrinkI, gridBagConstraints);

        btnGrowR.setText("+");
        btnGrowR.setMaximumSize(new java.awt.Dimension(41, 28));
        btnGrowR.setMinimumSize(new java.awt.Dimension(41, 28));
        btnGrowR.setPreferredSize(new java.awt.Dimension(41, 28));
        btnGrowR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrowRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        panelSize.add(btnGrowR, gridBagConstraints);

        btnGrowI.setText("+");
        btnGrowI.setMaximumSize(new java.awt.Dimension(41, 28));
        btnGrowI.setMinimumSize(new java.awt.Dimension(41, 28));
        btnGrowI.setPreferredSize(new java.awt.Dimension(41, 28));
        btnGrowI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrowIActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panelSize.add(btnGrowI, gridBagConstraints);

        txtSizeCols.setColumns(4);
        txtSizeCols.setEditable(false);
        txtSizeCols.setText("jTextField7");
        txtSizeCols.setMinimumSize(new java.awt.Dimension(38, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        panelSize.add(txtSizeCols, gridBagConstraints);

        jLabel9.setText("Cols");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        panelSize.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Rows");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        panelSize.add(jLabel10, gridBagConstraints);

        txtSizeRows.setColumns(4);
        txtSizeRows.setEditable(false);
        txtSizeRows.setText("jTextField7");
        txtSizeRows.setMinimumSize(new java.awt.Dimension(38, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        panelSize.add(txtSizeRows, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelControls.add(panelSize, gridBagConstraints);

        panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        panelDetail.setMinimumSize(new java.awt.Dimension(218, 118));
        panelDetail.setPreferredSize(new java.awt.Dimension(218, 118));

        btnDetailPlus.setText("+");
        btnDetailPlus.setPreferredSize(new java.awt.Dimension(40, 23));
        btnDetailPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailPlusActionPerformed(evt);
            }
        });

        btnDetailMinus.setText("-");
        btnDetailMinus.setPreferredSize(new java.awt.Dimension(40, 23));
        btnDetailMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailMinusActionPerformed(evt);
            }
        });

        txtIterations.setEditable(false);
        txtIterations.setText("jTextField1");
        txtIterations.setMinimumSize(new java.awt.Dimension(35, 20));

        btnBucketMinus.setText("-");
        btnBucketMinus.setPreferredSize(new java.awt.Dimension(40, 23));
        btnBucketMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucketMinusActionPerformed(evt);
            }
        });

        btnBucketPlus.setText("+");
        btnBucketPlus.setPreferredSize(new java.awt.Dimension(40, 23));
        btnBucketPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucketPlusActionPerformed(evt);
            }
        });

        txtBucketSize.setEditable(false);
        txtBucketSize.setText("jTextField1");
        txtBucketSize.setMinimumSize(new java.awt.Dimension(35, 20));

        jLabel1.setText("Iterations");

        jLabel2.setText("Bucket size");

        javax.swing.GroupLayout panelDetailLayout = new javax.swing.GroupLayout(panelDetail);
        panelDetail.setLayout(panelDetailLayout);
        panelDetailLayout.setHorizontalGroup(
            panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetailLayout.createSequentialGroup()
                        .addComponent(btnDetailMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnDetailPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(txtIterations, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetailLayout.createSequentialGroup()
                        .addComponent(btnBucketMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnBucketPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(txtBucketSize, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelDetailLayout.setVerticalGroup(
            panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailLayout.createSequentialGroup()
                .addGroup(panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetailPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetailMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBucketPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBucketMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBucketSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelControls.add(panelDetail, gridBagConstraints);

        panelZoom.setBorder(javax.swing.BorderFactory.createTitledBorder("Zoom"));
        panelZoom.setMinimumSize(new java.awt.Dimension(205, 118));
        panelZoom.setPreferredSize(new java.awt.Dimension(208, 118));

        btnZoomIn.setText("+");
        btnZoomIn.setPreferredSize(new java.awt.Dimension(40, 23));
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });

        btnZoomOut.setText("-");
        btnZoomOut.setPreferredSize(new java.awt.Dimension(40, 23));
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });

        txtReRange.setEditable(false);
        txtReRange.setFont(txtReRange.getFont().deriveFont((float)11));
        txtReRange.setText("jTextField1");

        jLabel7.setText("Re range");

        jLabel8.setText("Im range");

        txtImRange.setEditable(false);
        txtImRange.setText("jTextField1");

        javax.swing.GroupLayout panelZoomLayout = new javax.swing.GroupLayout(panelZoom);
        panelZoom.setLayout(panelZoomLayout);
        panelZoomLayout.setHorizontalGroup(
            panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZoomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelZoomLayout.createSequentialGroup()
                        .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelZoomLayout.createSequentialGroup()
                        .addGroup(panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(14, 14, 14)
                        .addGroup(panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtImRange)
                            .addComponent(txtReRange, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelZoomLayout.setVerticalGroup(
            panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZoomLayout.createSequentialGroup()
                .addGroup(panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelZoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtImRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelControls.add(panelZoom, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        panelLower.add(panelControls, gridBagConstraints);

        chkBoxColour.setSelected(true);
        chkBoxColour.setText("Colour");
        chkBoxColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxColourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelLower.add(chkBoxColour, gridBagConstraints);

        panelPositions.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Min Re:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 11, 0, 0);
        panelPositions.add(jLabel3, gridBagConstraints);

        txtMinRe.setEditable(false);
        txtMinRe.setText("jTextField1");
        txtMinRe.setPreferredSize(new java.awt.Dimension(68, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 11, 0);
        panelPositions.add(txtMinRe, gridBagConstraints);

        jLabel4.setText("Max Re:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 11, 0, 0);
        panelPositions.add(jLabel4, gridBagConstraints);

        txtMaxRe.setEditable(false);
        txtMaxRe.setText("jTextField1");
        txtMaxRe.setPreferredSize(new java.awt.Dimension(68, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 11, 0);
        panelPositions.add(txtMaxRe, gridBagConstraints);

        jLabel5.setText("Min Im:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 11, 0, 0);
        panelPositions.add(jLabel5, gridBagConstraints);

        txtMinIm.setEditable(false);
        txtMinIm.setText("jTextField1");
        txtMinIm.setPreferredSize(new java.awt.Dimension(68, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 11, 0);
        panelPositions.add(txtMinIm, gridBagConstraints);

        jLabel6.setText("Max Im:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 11, 0, 0);
        panelPositions.add(jLabel6, gridBagConstraints);

        txtMaxIm.setEditable(false);
        txtMaxIm.setText("jTextField1");
        txtMaxIm.setPreferredSize(new java.awt.Dimension(68, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 11, 0);
        panelPositions.add(txtMaxIm, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelLower.add(panelPositions, gridBagConstraints);

        jScrollPane1.setViewportView(panelLower);

        add(jScrollPane1, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        changeView(ZOOM, 0, 0, am.ITERATIONS);
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnDetailMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailMinusActionPerformed
        if (am.ITERATIONS > 12) {
            changeView(1, 0, 0, am.ITERATIONS - 12);
        }
    }//GEN-LAST:event_btnDetailMinusActionPerformed

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        changeView(1 / ZOOM, 0, 0, am.ITERATIONS);
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnDetailPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailPlusActionPerformed
        changeView(1, 0, 0, am.ITERATIONS + 12);
    }//GEN-LAST:event_btnDetailPlusActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        changeView(1, 0, -1, am.ITERATIONS);
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        changeView(1, 0, 1, am.ITERATIONS);
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        changeView(1, -1, 0, am.ITERATIONS);
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        changeView(1, 1, 0, am.ITERATIONS);
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnShrinkRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShrinkRActionPerformed
//TODO: implement snapping to integer values
        if (am.XCOLS > 5) {
            am.XCOLS = (int) (am.XCOLS / GROW);
            updateGraph();
        }
    }//GEN-LAST:event_btnShrinkRActionPerformed

    private void btnShrinkIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShrinkIActionPerformed
        if (am.YROWS > 4) {
            am.YROWS = (int) (am.YROWS / GROW);
            updateGraph();
        }
    }//GEN-LAST:event_btnShrinkIActionPerformed

    private void btnGrowRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrowRActionPerformed
        am.XCOLS = (int) (am.XCOLS * GROW);
        updateGraph();
    }//GEN-LAST:event_btnGrowRActionPerformed

    private void btnGrowIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrowIActionPerformed
        am.YROWS = (int) (am.YROWS * GROW);
        updateGraph();
    }//GEN-LAST:event_btnGrowIActionPerformed

    private void btnBucketMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucketMinusActionPerformed
        if (am.BUCKET >= 2) {
            am.BUCKET--;
            updateGraph();
        }
    }//GEN-LAST:event_btnBucketMinusActionPerformed

    private void btnBucketPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucketPlusActionPerformed
        if (am.BUCKET < 256) {
            am.BUCKET++;
            updateGraph();
        }
    }//GEN-LAST:event_btnBucketPlusActionPerformed

    private void chkBoxColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxColourActionPerformed
        updateGraph();
    }//GEN-LAST:event_chkBoxColourActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBucketMinus;
    private javax.swing.JButton btnBucketPlus;
    private javax.swing.JButton btnDetailMinus;
    private javax.swing.JButton btnDetailPlus;
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnGrowI;
    private javax.swing.JButton btnGrowR;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnShrinkI;
    private javax.swing.JButton btnShrinkR;
    private javax.swing.JButton btnUp;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JCheckBox chkBoxColour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelControls;
    private javax.swing.JPanel panelDetail;
    private javax.swing.JPanel panelLower;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMove;
    private javax.swing.JPanel panelPositions;
    private javax.swing.JPanel panelSize;
    private javax.swing.JPanel panelZoom;
    private javax.swing.JScrollPane scrollPaneMain;
    private javax.swing.JTextField txtBucketSize;
    private javax.swing.JTextField txtImRange;
    private javax.swing.JTextField txtIterations;
    private javax.swing.JTextField txtMaxIm;
    private javax.swing.JTextField txtMaxRe;
    private javax.swing.JTextField txtMinIm;
    private javax.swing.JTextField txtMinRe;
    private javax.swing.JTextField txtReRange;
    private javax.swing.JTextField txtSizeCols;
    private javax.swing.JTextField txtSizeRows;
    // End of variables declaration//GEN-END:variables
}
