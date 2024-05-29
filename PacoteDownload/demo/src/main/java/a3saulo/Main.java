package a3saulo;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    private static List<User> usuarios = new ArrayList<>();
    private static List<Task> tarefas = new ArrayList<>();
    
    public static void cadastrarUsuario(String nome, String email, String senha){

        User user = new User(nome, email, senha);
        usuarios.add(user);
       JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        cadastrarUsuario("João", "joao@example.com", "senha123");
    }
    }
