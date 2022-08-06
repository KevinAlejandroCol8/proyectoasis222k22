package trabajadores.vista;

import administracion.vista.*;
import java.util.List;

import administracion.controlador.ProcesosRepetidos;
import administracion.controlador.Vehiculos;
import administracion.modelo.VehiculosDAO;
import trabajadores.controlador.RutasDestinatario;
import trabajadores.controlador.TrabajadorVehiculo;
import trabajadores.modelo.RutasDestinatariosDAO;
import trabajadores.modelo.TrabajadorVehiculoDAO;

public class Prcs_RutaDestinatario extends javax.swing.JInternalFrame {

    ProcesosRepetidos procesosr = new ProcesosRepetidos();
    //FuncionesBitacora funcBitacora = new FuncionesBitacora();
    RutasDestinatario ruta = new RutasDestinatario();
    RutasDestinatariosDAO rutaDAO = new RutasDestinatariosDAO();
    TrabajadorVehiculo asignacion = new TrabajadorVehiculo();
    TrabajadorVehiculoDAO pilotovdao = new TrabajadorVehiculoDAO();

    public Prcs_RutaDestinatario() {
        initComponents();
        diseño();
        cargarDatos("");
    }

    public void diseño() {
        setTitle("Creación de Rutas Destinatario");
        procesosr.cursorMano(Tbl_Datos, Btn_ayuda, Btn_cancelar, Btn_eliminar, Btn_guardar, Btn_modificar, Btn_reporte);
    }

    private void limpiar() {
        procesosr.limpiarTxf(Txt_idAsignacion, Txt_idAsn, Txt_datos1, Txt_datos2, Txt_busqueda, Txt_estado);
        Txt_idAsn.setText("0");
    }

    private void cargarDatos(String query) {
        ProcesosRepetidos procesosr = new ProcesosRepetidos();
        RutasDestinatariosDAO.idRuta = query;
        RutasDestinatariosDAO.idVehiculo = query;
        String encabezado[] = {"ID RUTA", "ID ASIGNACION PILOTO-VEHICULO", "ESTADO"};
        int cantidadcolumnas = encabezado.length;
        procesosr.llenarColumnas(encabezado, cantidadcolumnas, Tbl_Datos);
        String datos[] = new String[cantidadcolumnas];
        int tamaño[] = {100, 250, 125};
        RutasDestinatariosDAO rutaDAO = new RutasDestinatariosDAO();
        List<RutasDestinatario> listadoRutas = rutaDAO.select();
        for (RutasDestinatario ruta : listadoRutas) {
            datos[0] = ruta.getIdRuta();
            datos[1] = ruta.getIdVehiculo();
            if (ruta.getEstado().equals("1")) {
                datos[2] = "EN USO";
            } else if (ruta.getEstado().equals("2")) {
                datos[2] = "TERMINADA";
            } else {
                datos[2] = "ASIGNADA";
            }
            procesosr.llenarFilas(datos, tamaño, Tbl_Datos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg_estados = new javax.swing.ButtonGroup();
        Pnl_ingresoDatos = new javax.swing.JPanel();
        Lbl_idAsn = new javax.swing.JLabel();
        Txt_idAsn = new javax.swing.JTextField();
        Lbl_idVehiculo = new javax.swing.JLabel();
        Txt_idAsignacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Btn_buscarAsignacion = new javax.swing.JButton();
        Txt_datos1 = new javax.swing.JTextField();
        Txt_datos2 = new javax.swing.JTextField();
        Lbl_estado = new javax.swing.JLabel();
        Btn_fondoGuardar = new javax.swing.JPanel();
        Btn_guardar = new javax.swing.JLabel();
        Btn_fondoEliminar = new javax.swing.JPanel();
        Btn_eliminar = new javax.swing.JLabel();
        Btn_fondoModificar = new javax.swing.JPanel();
        Btn_modificar = new javax.swing.JLabel();
        Btn_fondoReporte = new javax.swing.JPanel();
        Btn_reporte = new javax.swing.JLabel();
        Btn_fondoAyuda = new javax.swing.JPanel();
        Btn_ayuda = new javax.swing.JLabel();
        Btn_fondoCancelar = new javax.swing.JPanel();
        Btn_cancelar = new javax.swing.JLabel();
        Txt_estado = new javax.swing.JTextField();
        Pnl_datos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Datos = new javax.swing.JTable();
        Lbl_id4 = new javax.swing.JLabel();
        Txt_busqueda = new javax.swing.JTextField();

        setBackground(new java.awt.Color(172, 203, 225));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setToolTipText("");

        Pnl_ingresoDatos.setBackground(new java.awt.Color(172, 203, 225));
        Pnl_ingresoDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 78, 65), 1, true));

        Lbl_idAsn.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_idAsn.setText("ID ASIGNACIÓN:");

        Txt_idAsn.setEditable(false);
        Txt_idAsn.setBackground(new java.awt.Color(172, 203, 225));
        Txt_idAsn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_idAsn.setText("0");
        Txt_idAsn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));

        Lbl_idVehiculo.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_idVehiculo.setText("ID Vehiculo:");

        Txt_idAsignacion.setBackground(new java.awt.Color(172, 203, 225));
        Txt_idAsignacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_idAsignacion.setText("0");
        Txt_idAsignacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Btn_buscarAsignacion.setText("CARGAR");
        Btn_buscarAsignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_buscarAsignacionActionPerformed(evt);
            }
        });

        Txt_datos1.setBackground(new java.awt.Color(172, 203, 225));
        Txt_datos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_datos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));

        Txt_datos2.setBackground(new java.awt.Color(172, 203, 225));
        Txt_datos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_datos2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));

        Lbl_estado.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_estado.setText("ESTADO:");

        Btn_fondoGuardar.setBackground(new java.awt.Color(97, 212, 195));
        Btn_fondoGuardar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoGuardar.setMinimumSize(new java.awt.Dimension(104, 40));

        Btn_guardar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_guardar.setText("Insertar");
        Btn_guardar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_guardar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_guardar.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_guardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoGuardarLayout = new javax.swing.GroupLayout(Btn_fondoGuardar);
        Btn_fondoGuardar.setLayout(Btn_fondoGuardarLayout);
        Btn_fondoGuardarLayout.setHorizontalGroup(
            Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );
        Btn_fondoGuardarLayout.setVerticalGroup(
            Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Btn_fondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Btn_guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        Btn_fondoEliminar.setBackground(new java.awt.Color(97, 212, 195));
        Btn_fondoEliminar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoEliminar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoEliminar.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_eliminar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_eliminar.setText("Eliminar");
        Btn_eliminar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_eliminar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_eliminar.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_eliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoEliminarLayout = new javax.swing.GroupLayout(Btn_fondoEliminar);
        Btn_fondoEliminar.setLayout(Btn_fondoEliminarLayout);
        Btn_fondoEliminarLayout.setHorizontalGroup(
            Btn_fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoEliminarLayout.setVerticalGroup(
            Btn_fondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Btn_fondoModificar.setBackground(new java.awt.Color(97, 212, 195));
        Btn_fondoModificar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoModificar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoModificar.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_modificar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_modificar.setText("Modificar");
        Btn_modificar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_modificar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_modificar.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_modificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_modificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoModificarLayout = new javax.swing.GroupLayout(Btn_fondoModificar);
        Btn_fondoModificar.setLayout(Btn_fondoModificarLayout);
        Btn_fondoModificarLayout.setHorizontalGroup(
            Btn_fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoModificarLayout.setVerticalGroup(
            Btn_fondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Btn_fondoReporte.setBackground(new java.awt.Color(97, 212, 195));
        Btn_fondoReporte.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoReporte.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoReporte.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_reporte.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_reporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_reporte.setText("Reporte");
        Btn_reporte.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_reporte.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_reporte.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_reporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_reporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_reporteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoReporteLayout = new javax.swing.GroupLayout(Btn_fondoReporte);
        Btn_fondoReporte.setLayout(Btn_fondoReporteLayout);
        Btn_fondoReporteLayout.setHorizontalGroup(
            Btn_fondoReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoReporteLayout.setVerticalGroup(
            Btn_fondoReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Btn_fondoAyuda.setBackground(new java.awt.Color(253, 255, 182));
        Btn_fondoAyuda.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoAyuda.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoAyuda.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_ayuda.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_ayuda.setText("Ayuda");
        Btn_ayuda.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_ayuda.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_ayuda.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ayudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ayudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ayudaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoAyudaLayout = new javax.swing.GroupLayout(Btn_fondoAyuda);
        Btn_fondoAyuda.setLayout(Btn_fondoAyudaLayout);
        Btn_fondoAyudaLayout.setHorizontalGroup(
            Btn_fondoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoAyudaLayout.setVerticalGroup(
            Btn_fondoAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Btn_fondoCancelar.setBackground(new java.awt.Color(255, 128, 115));
        Btn_fondoCancelar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_fondoCancelar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_fondoCancelar.setPreferredSize(new java.awt.Dimension(104, 40));

        Btn_cancelar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Btn_cancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_cancelar.setText("Cancelar");
        Btn_cancelar.setMaximumSize(new java.awt.Dimension(104, 40));
        Btn_cancelar.setMinimumSize(new java.awt.Dimension(104, 40));
        Btn_cancelar.setPreferredSize(new java.awt.Dimension(104, 40));
        Btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_cancelarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Btn_fondoCancelarLayout = new javax.swing.GroupLayout(Btn_fondoCancelar);
        Btn_fondoCancelar.setLayout(Btn_fondoCancelarLayout);
        Btn_fondoCancelarLayout.setHorizontalGroup(
            Btn_fondoCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_fondoCancelarLayout.setVerticalGroup(
            Btn_fondoCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Txt_estado.setEditable(false);
        Txt_estado.setBackground(new java.awt.Color(172, 203, 225));
        Txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_estado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));

        javax.swing.GroupLayout Pnl_ingresoDatosLayout = new javax.swing.GroupLayout(Pnl_ingresoDatos);
        Pnl_ingresoDatos.setLayout(Pnl_ingresoDatosLayout);
        Pnl_ingresoDatosLayout.setHorizontalGroup(
            Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_fondoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Btn_fondoAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_fondoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addComponent(Lbl_idAsn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(Txt_idAsn))
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addComponent(Lbl_estado)
                        .addGap(79, 79, 79)
                        .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_datos1)
                            .addComponent(Txt_datos2)
                            .addComponent(Txt_estado)))
                    .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                        .addComponent(Lbl_idVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Txt_idAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_buscarAsignacion)))
                .addContainerGap())
        );
        Pnl_ingresoDatosLayout.setVerticalGroup(
            Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_ingresoDatosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_idAsn)
                    .addComponent(Txt_idAsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_idVehiculo)
                    .addComponent(Txt_idAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(Btn_buscarAsignacion))
                .addGap(18, 18, 18)
                .addComponent(Txt_datos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Txt_datos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_estado)
                    .addComponent(Txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_fondoReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pnl_ingresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_fondoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_fondoModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Pnl_datos.setBackground(new java.awt.Color(172, 203, 225));
        Pnl_datos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 78, 65), 1, true));

        Tbl_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tbl_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_DatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tbl_Datos);

        Lbl_id4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        Lbl_id4.setText("BUSCAR ID Ó NOMBRE:");

        Txt_busqueda.setBackground(new java.awt.Color(172, 203, 225));
        Txt_busqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_busqueda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(88, 129, 87)));
        Txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_busquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Pnl_datosLayout = new javax.swing.GroupLayout(Pnl_datos);
        Pnl_datos.setLayout(Pnl_datosLayout);
        Pnl_datosLayout.setHorizontalGroup(
            Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(Pnl_datosLayout.createSequentialGroup()
                        .addComponent(Lbl_id4)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_busqueda)))
                .addContainerGap())
        );
        Pnl_datosLayout.setVerticalGroup(
            Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Txt_busqueda)
                    .addComponent(Lbl_id4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pnl_ingresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pnl_ingresoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pnl_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tbl_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_DatosMouseClicked
        if (evt.getClickCount() == 2) {
            Txt_idAsn.setText(Tbl_Datos.getValueAt(Tbl_Datos.getSelectedRow(), 0).toString());
            Txt_idAsignacion.setText(Tbl_Datos.getValueAt(Tbl_Datos.getSelectedRow(), 1).toString());
            Txt_estado.setText(Tbl_Datos.getValueAt(Tbl_Datos.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_Tbl_DatosMouseClicked

    private void Btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cancelarMouseExited
        procesosr.pintarComponente("dsRojo", Btn_fondoCancelar);
    }//GEN-LAST:event_Btn_cancelarMouseExited

    private void Btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cancelarMouseEntered
        procesosr.pintarComponente("sRojo", Btn_fondoCancelar);
    }//GEN-LAST:event_Btn_cancelarMouseEntered

    private void Btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_cancelarMouseClicked
        limpiar();
    }//GEN-LAST:event_Btn_cancelarMouseClicked

    private void Btn_ayudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ayudaMouseExited
        procesosr.pintarComponente("dsAmarillo", Btn_fondoAyuda);
    }//GEN-LAST:event_Btn_ayudaMouseExited

    private void Btn_ayudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ayudaMouseEntered
        procesosr.pintarComponente("sAmarillo", Btn_fondoAyuda);
    }//GEN-LAST:event_Btn_ayudaMouseEntered

    private void Btn_reporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_reporteMouseExited
        procesosr.pintarComponente("dsVerde", Btn_fondoReporte);
    }//GEN-LAST:event_Btn_reporteMouseExited

    private void Btn_reporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_reporteMouseEntered
        procesosr.pintarComponente("sVerde", Btn_fondoReporte);
    }//GEN-LAST:event_Btn_reporteMouseEntered

    private void Btn_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_modificarMouseExited
        procesosr.pintarComponente("dsVerde", Btn_fondoModificar);
    }//GEN-LAST:event_Btn_modificarMouseExited

    private void Btn_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_modificarMouseEntered
        procesosr.pintarComponente("sVerde", Btn_fondoModificar);
    }//GEN-LAST:event_Btn_modificarMouseEntered

    private void Btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_modificarMouseClicked
        if (procesosr.isEmptyTxf(Txt_idAsignacion, Txt_datos1, Txt_datos2)) {
            if (procesosr.isNumeric(Txt_idAsignacion)) {
                ruta.setIdRuta(Txt_idAsn.getText());
                ruta.setIdVehiculo(Txt_idAsignacion.getText());
                //ruta.setEstado(Txt_estado.getText());
                rutaDAO.update(ruta);
                cargarDatos("");
                procesosr.accionExitosa("Registro Exitoso", "Se ha registrado la ruta para el vehiculo: \"" + Txt_datos1.getText() + "\" correctamente");
                limpiar();
            }
        }
    }//GEN-LAST:event_Btn_modificarMouseClicked

    private void Btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_eliminarMouseExited
        procesosr.pintarComponente("dsVerde", Btn_fondoEliminar);
    }//GEN-LAST:event_Btn_eliminarMouseExited

    private void Btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_eliminarMouseEntered
        procesosr.pintarComponente("sVerde", Btn_fondoEliminar);
    }//GEN-LAST:event_Btn_eliminarMouseEntered

    private void Btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_eliminarMouseClicked
        if (procesosr.isEmptyTxf(Txt_idAsn)) {
            if (procesosr.isNumeric(Txt_idAsn)) {
                if (procesosr.confirmarEliminación("la ruta# " + Txt_idAsn.getText())) {
                    ruta.setIdRuta(Txt_idAsn.getText());
                    rutaDAO.delete(ruta);
                    cargarDatos("");
                    procesosr.accionExitosa("Eliminación Exitosa", "Se ha eliminado la ruta #" + Txt_idAsn.getText() + " correctamente");
                    limpiar();
                }
            }
        }
    }//GEN-LAST:event_Btn_eliminarMouseClicked

    private void Btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_guardarMouseExited
        procesosr.pintarComponente("dsVerde", Btn_fondoGuardar);
    }//GEN-LAST:event_Btn_guardarMouseExited

    private void Btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_guardarMouseEntered
        procesosr.pintarComponente("sVerde", Btn_fondoGuardar);
    }//GEN-LAST:event_Btn_guardarMouseEntered

    private void Btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_guardarMouseClicked
        if (procesosr.isEmptyTxf(Txt_idAsignacion, Txt_datos1, Txt_datos2)) {
            if (procesosr.isNumeric(Txt_idAsignacion)) {
                ruta.setIdVehiculo(Txt_idAsignacion.getText());
                ruta.setEstado("0");
                rutaDAO.insert(ruta);
                cargarDatos("");
                procesosr.accionExitosa("Registro Exitoso", "Se ha registrado la ruta para el vehiculo: \"" + Txt_datos1.getText() + "\" correctamente");
                limpiar();
            }
        }
    }//GEN-LAST:event_Btn_guardarMouseClicked

    private void Btn_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ayudaMouseClicked
        System.out.println("ayuda");
    }//GEN-LAST:event_Btn_ayudaMouseClicked

    private void Btn_reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_reporteMouseClicked
        System.out.println("reporte");
    }//GEN-LAST:event_Btn_reporteMouseClicked

    private void Txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_busquedaKeyReleased
        String query = Txt_busqueda.getText();
        cargarDatos(query);
    }//GEN-LAST:event_Txt_busquedaKeyReleased

    private void Btn_buscarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_buscarAsignacionActionPerformed
        if (procesosr.isEmptyTxf(Txt_idAsignacion)) {
            if (procesosr.isNumeric(Txt_idAsignacion)) {
                asignacion.setIdAsignacion(Txt_idAsignacion.getText());
                asignacion = pilotovdao.selectRM(asignacion);
                if (asignacion.getIdVehiculo() == null) {
                    procesosr.accionErronea("¡ERROR!", "ASIGNACIÓN NO ENCONTRADA");
                } else {
                    Vehiculos vehiculos = new Vehiculos();
                    VehiculosDAO vehiculosDAO = new VehiculosDAO();
                    vehiculos.setId(asignacion.getIdVehiculo());
                    vehiculos = vehiculosDAO.selectUA(vehiculos);
                    Txt_datos1.setText(vehiculos.getMarca() + " " + vehiculos.getPlaca());
                    Txt_datos2.setText("Capacidad de " + vehiculos.getMax() + " pedidos");
                }

            }
        }
    }//GEN-LAST:event_Btn_buscarAsignacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vst_TrabajadoresVehiculos vst_vehiculos = new Vst_TrabajadoresVehiculos();
        vst_vehiculos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Bg_estados;
    private javax.swing.JLabel Btn_ayuda;
    private javax.swing.JButton Btn_buscarAsignacion;
    private javax.swing.JLabel Btn_cancelar;
    private javax.swing.JLabel Btn_eliminar;
    private javax.swing.JPanel Btn_fondoAyuda;
    private javax.swing.JPanel Btn_fondoCancelar;
    private javax.swing.JPanel Btn_fondoEliminar;
    private javax.swing.JPanel Btn_fondoGuardar;
    private javax.swing.JPanel Btn_fondoModificar;
    private javax.swing.JPanel Btn_fondoReporte;
    private javax.swing.JLabel Btn_guardar;
    private javax.swing.JLabel Btn_modificar;
    private javax.swing.JLabel Btn_reporte;
    private javax.swing.JLabel Lbl_estado;
    private javax.swing.JLabel Lbl_id4;
    private javax.swing.JLabel Lbl_idAsn;
    private javax.swing.JLabel Lbl_idVehiculo;
    private javax.swing.JPanel Pnl_datos;
    private javax.swing.JPanel Pnl_ingresoDatos;
    private javax.swing.JTable Tbl_Datos;
    private javax.swing.JTextField Txt_busqueda;
    private javax.swing.JTextField Txt_datos1;
    private javax.swing.JTextField Txt_datos2;
    private javax.swing.JTextField Txt_estado;
    private javax.swing.JTextField Txt_idAsignacion;
    private javax.swing.JTextField Txt_idAsn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
