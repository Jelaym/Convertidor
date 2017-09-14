package examen;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Touchier
 * @version 1.0
 */
public class swingConver implements ActionListener{
    //Inicializamos Componentes
    Container _Cont;
    JFrame _Windows;
    JLabel _Dato, _Titulo;
    JButton _Convertidor, _Limpiar, _Creador;
    JButton _Uno, _Dos, _Tres, _Cuatro, _Cinco, _Seis, _Siete, _Ocho, _Nueve, _Cero, _Punto;
    
    //Metodo Constructor
    public swingConver(){
        ventana();
        contenido();
    }
    //Metodo que mostrara la ventana cuando sea ejecutado todo el contenido
    public void mostrar(){
        _Windows.setVisible(true);
    }
    //Declaramos Ventana
    public void ventana(){
        _Windows= new JFrame();
        _Windows.setBounds(400,200,500,430);
        _Windows.setLayout(null);
        _Windows.setBackground(Color.WHITE);
        _Windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _Cont= _Windows.getContentPane();
    }
    //Declaramos contenido de la ventana
    public void contenido(){
        //Labels
        _Titulo= new JLabel("Convertidor de Pesos a Dolares");
        _Titulo.setBounds(100,10,400,40);
        _Titulo.setFont(new Font("Arial", Font.BOLD, 17));
        _Cont.add(_Titulo);
        
        _Dato= new JLabel();
        _Dato.setBounds(50, 50, 400, 50);
        _Dato.setBackground(Color.WHITE);
        _Dato.setFont(new Font("Arial", Font.BOLD, 15));
        _Cont.add(_Dato);
        
        //Buttons
        _Uno= CreadorBoton("1", 50, 120, 50, 50);
        _Dos= CreadorBoton("2", 110, 120, 50, 50);
        _Tres= CreadorBoton("3", 170, 120, 50, 50);
        
        _Cuatro= CreadorBoton("4", 50, 180, 50, 50);
        _Cinco= CreadorBoton("5", 110, 180, 50, 50);
        _Seis= CreadorBoton("6", 170, 180, 50, 50);
        
        _Siete= CreadorBoton("7", 50, 240, 50, 50);
        _Ocho= CreadorBoton("8", 110, 240, 50, 50);
        _Nueve= CreadorBoton("9", 170, 240, 50, 50);
        
        _Cero= CreadorBoton("0", 50, 300, 50, 50);
        _Punto= CreadorBoton(".", 110, 300, 50, 50);
        
        _Convertidor= CreadorBoton("Convertir", 250, 120, 200, 75);
        _Limpiar= CreadorBoton("Limpiar", 250, 210, 200, 75);
        //Agregadmos ActionListener a los botones
        _Uno.addActionListener(this);
        _Dos.addActionListener(this);
        _Tres.addActionListener(this);
        _Cuatro.addActionListener(this);
        _Cinco.addActionListener(this);
        _Seis.addActionListener(this);
        _Siete.addActionListener(this);
        _Ocho.addActionListener(this);
        _Nueve.addActionListener(this);
        _Cero.addActionListener(this);
        _Punto.addActionListener(this);
        
        _Convertidor.addActionListener(this);
        _Limpiar.addActionListener(this);
        //Agregamos al contenedor de la ventana
        _Cont.add(_Uno);
        _Cont.add(_Dos);
        _Cont.add(_Tres);
        _Cont.add(_Cuatro);
        _Cont.add(_Cinco);
        _Cont.add(_Seis);
        _Cont.add(_Siete);
        _Cont.add(_Ocho);
        _Cont.add(_Nueve);
        _Cont.add(_Cero);
        _Cont.add(_Punto);
        
        _Cont.add(_Convertidor);
        _Cont.add(_Limpiar);
    }
    
    public JButton CreadorBoton(String nombre, int xPos, int yPos, int ancho, int largo){
        _Creador= new JButton(nombre);
        // x, y, ancho, largo
        _Creador.setBounds(xPos, yPos, ancho, largo);
        _Creador.setBackground(Color.BLACK);
        _Creador.setForeground(Color.WHITE);
        return _Creador;
    }
    public void convertor(){
        String dato= _Dato.getText();
        if(dato.length() != 0){
            float numero= Integer.parseInt(dato);
            float resultado= numero/17;
            dato= resultado + "";
            _Dato.setText(dato);
        }else{
            JOptionPane.showMessageDialog(null, "No hay número");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dato;
        boolean botonApretado= false;
        if(e.getSource() == _Convertidor){
            botonApretado= true;
            convertor();
        }else{
            if(e.getSource() == _Limpiar){
                _Dato.setText("");
            }else{
                dato= _Dato.getText();
                if(botonApretado == true){
                    _Dato.setText("");
                    botonApretado= false;
                }
                
                if(e.getSource() == _Uno){
                    _Dato.setText(dato + _Uno.getText());
                }else{
                    if(e.getSource() == _Dos){
                        _Dato.setText(dato + _Dos.getText());
                    }else{
                        if(e.getSource() == _Tres){
                            _Dato.setText(dato + _Tres.getText());
                        }else{
                            if(e.getSource() == _Cuatro){
                                _Dato.setText(dato + _Cuatro.getText());
                            }else{
                                if(e.getSource() == _Cinco){
                                    _Dato.setText(dato + _Cinco.getText());
                                }else{
                                    if(e.getSource() == _Seis){
                                        _Dato.setText(dato + _Seis.getText());
                                    }else{
                                        if(e.getSource() == _Siete){
                                            _Dato.setText(dato + _Siete.getText());
                                        }else{
                                            if(e.getSource() == _Ocho){
                                                _Dato.setText(dato + _Ocho.getText());
                                            }else{
                                                if(e.getSource() == _Nueve){
                                                    _Dato.setText(dato + _Nueve.getText());
                                                }else{
                                                    if(e.getSource() == _Cero){
                                                        _Dato.setText(dato + _Cero.getText());
                                                    }else{
                                                        if(e.getSource() == _Punto){
                                                            _Dato.setText(dato + _Punto.getText());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
