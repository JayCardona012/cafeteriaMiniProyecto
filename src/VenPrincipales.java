import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.jar.Attributes.Name;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VenPrincipales<panelLogin> extends JFrame{

public JPanel panelBprincipales;
public JPanel panelBotones;
public JPanel panelLogin;
public JPanel panelMesas;


   


    
    public VenPrincipales(){  //Creamos el constructor y dentro de este creamos el JFrame

        setTitle("Cafeteria sabor y aroma");
        setSize(700, 450);
        setLocationRelativeTo(null);  
        iniciarComponentes();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }    

//============================================================================
    private void iniciarComponentes(){
        iniciarPaneles();
        iniciarEtiquetas();
        iniciarBotones();
        iniciarCajasTexto();
        
    }
//============================================================================
    private void iniciarPaneles(){

        panelBprincipales = new JPanel();
        panelBprincipales.setLayout(null);//desactivamos el layout por defecto que esta centrado
        panelBprincipales.setBackground(Color.WHITE);// establecemos el color del panel
        panelBprincipales.setSize(300, 600);
        this.getContentPane().add(panelBprincipales);//agregamos el panel a la ventana

        //panel donde se agregan los botones principales
        panelBotones = new JPanel();
        panelBotones.setLayout(null);
        panelBotones.setSize(150, 600);
        panelBotones.setBackground(new Color(30, 136, 229));

        panelBprincipales.add(panelBotones);
      
         //creamos ek JPanel del login
        panelLogin = new JPanel();
        panelLogin.setLayout(null);
        panelLogin.setBackground(Color.WHITE);
        panelLogin.setSize(700, 600);
        panelBprincipales.add(panelLogin);
        
        //creamos el JPanle de las Mesas

        panelMesas = new JPanel();
        panelMesas.setLayout(null);
        panelMesas.setSize(700, 600);
        panelMesas.setBackground(Color.PINK);
        panelBprincipales.add(panelMesas);




        

    }
//============================================================================

    private void iniciarEtiquetas(){

        //etiqueta tipo imagen del login

        ImageIcon usuario = new ImageIcon("usuario.png");
        JLabel imagen = new JLabel(usuario);
        imagen.setLayout(null);
        imagen.setBounds(350, 50, 100, 100);
        imagen.setIcon(new ImageIcon(usuario.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight() , Image.SCALE_SMOOTH)));

        panelLogin.add(imagen);



       
    }

    private void iniciarCajasTexto(){

        JTextField name = new JTextField();
        name.setBounds(250, 175, 300, 40);//definimos la posocion y tamaño de la caja de texto
        name.setText("Nombre de usuario");
        name.setEditable(true);//establecemos si se puede editar o no el area de texto
        name.setBackground(Color.WHITE);//establecemos el color de fond 
        name.setFont(new Font("arial", Font.BOLD, 13));
        name.setOpaque(false);
        name.setForeground(new Color(40, 40,40, 100));
        name.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
               name.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
            
        });

        panelLogin.add(name);


        JPasswordField password = new JPasswordField();
        password.setBounds(250, 250, 300, 40);//definimos la posocion y tamaño de la caja de texto
        password.setEditable(true);//establecemos si se puede editar o no el area de texto
        password.setText("Contraseña");
        password.setBackground(Color.WHITE);//establecemos el color de fond 
        password.setFont(new Font("arial", Font.BOLD, 13));

        panelLogin.add(password);

    }
   
//============================================================================    
    /**
     * 
     */
    private void iniciarBotones(){

        JButton botonLogin = new JButton();
        botonLogin.setText("Login");
        botonLogin.setBounds(20, 20, 100, 30);
        botonLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                
                
            }
            
        });
        panelBotones.add(botonLogin);


        JButton botonMesas = new JButton();
        botonMesas.setText("Mesas");
        botonMesas.setBounds(20, 60, 100, 30);
        botonMesas.setEnabled(true);
        panelBotones.add(botonMesas);


        JButton botonVend = new JButton();
        botonVend.setText("Venta dia");
        botonVend.setBounds(20, 100, 100, 30);
        botonVend.setEnabled(false);
        panelBotones.add(botonVend);


        JButton usuarios  = new JButton();
        usuarios .setText("Usuarios");
        usuarios .setBounds(20, 140, 100, 30);
        usuarios.setEnabled(false);
        panelBotones.add(usuarios);

        
       //creamos el boton cerrar y configuramos su funcionamiento
        JButton botonCe = new JButton();
        botonCe.setText("Cerrar");
        botonCe.setBounds(20, 180, 100, 30);
        botonCe.addActionListener(new ActionListener() {  //agregamos el addAcionlistener al boton para que al precionarlo funcione

            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(null, "desea salir de la APP", "SALIR", JOptionPane.YES_NO_OPTION);
                if(respuesta == JOptionPane.YES_OPTION){ //creamos el bucle que se encarga de evaluar la desicion de usiario
                    System.exit(0);
                }
                
            }
            
        });

        panelBotones.add(botonCe);


        JButton logins = new JButton();
        logins.setText("Login");
        logins.setBounds(420, 320, 100, 30);
        logins.setForeground(Color.WHITE);
        logins.setBackground(new Color(30, 136, 229));

        panelLogin.add(logins);


        JButton Idatos = new JButton();
        Idatos.setText("Register");
        Idatos.setBounds(280, 320, 100, 30);
        Idatos.setForeground(Color.WHITE);
        Idatos.setBackground(new Color(30, 136, 229));

        panelLogin.add(Idatos);

        //cramos los botonens donde salen las imagenes de las mesas
       // ImageIcon comedor = new ImageIcon("comedor.png");
        //JButton Mesas = new JButton(comedor);
       // Mesas.setBounds(100, 100, 200, 300);


       // panelMesas.add(Mesas);
        
        
    }

   


//============================================================================



    
}
