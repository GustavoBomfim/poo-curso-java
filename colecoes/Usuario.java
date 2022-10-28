package colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome){
        this.nome = nome;
    }


    @Override
    public boolean equals(Object obj) {
        Usuario outroUsuario = (Usuario) obj;
        return this.nome.equals(outroUsuario.nome);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
