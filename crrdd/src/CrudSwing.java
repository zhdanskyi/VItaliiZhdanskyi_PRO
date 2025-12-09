import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Estudiante {
    int id;
    String nombre;

    Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

public class CrudSwing extends JFrame {

    private JTextField txtId, txtNombre;
    private JTextArea area;
    private ArrayList<Estudiante> lista;

    public CrudSwing() {
        lista = new ArrayList<>();
        setTitle("CRUD Estudiantes - Swing");
        setSize(480, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblId = new JLabel("ID de estudiante:");
        lblId.setBounds(20, 20, 100, 30);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(120, 20, 150, 30);
        add(txtId);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 60, 100, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 60, 150, 30);
        add(txtNombre);

        JButton btnCrear = new JButton("Crear");
        btnCrear.setBounds(300, 20, 120, 30);
        add(btnCrear);

        JButton btnLeer = new JButton("Listar estudiantes");
        btnLeer.setBounds(300, 60, 120, 30);
        add(btnLeer);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(300, 100, 120, 30);
        add(btnActualizar);

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setBounds(300, 140, 120, 30);
        add(btnBorrar);

        area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(20, 200, 420, 180);
        add(scroll);

        // --- ACCIONES ---------------------------

        btnCrear.addActionListener(e -> crear());
        btnLeer.addActionListener(e -> leer());
        btnActualizar.addActionListener(e -> actualizar());
        btnBorrar.addActionListener(e -> borrar());
    }

    private void crear() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();

            lista.add(new Estudiante(id, nombre));
            area.setText("Estudiante añadido.\n");
        } catch (Exception e) {
            area.setText("Error: verifica los datos.\n");
        }
    }

    private void leer() {
        StringBuilder sb = new StringBuilder("--- LISTA DE ESTUDIANTES ---\n");
        for (Estudiante e : lista) {
            sb.append("ID: ").append(e.id).append(" - Nombre: ").append(e.nombre).append("\n");
        }
        area.setText(sb.toString());
    }

    private void actualizar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String nuevoNombre = txtNombre.getText();

            for (Estudiante e : lista) {
                if (e.id == id) {
                    e.nombre = nuevoNombre;
                    area.setText("Estudiante actualizado.\n");
                    return;
                }
            }
            area.setText("No encontrado.\n");
        } catch (Exception e) {
            area.setText("Error al actualizar.\n");
        }
    }

    private void borrar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            lista.removeIf(e -> e.id == id);
            area.setText("Estudiante eliminado (si existía).\n");
        } catch (Exception e) {
            area.setText("Error.\n");
        }
    }

    public static void main(String[] args) {
        CrudSwing app = new CrudSwing();
        app.setVisible(true);
    }
}
