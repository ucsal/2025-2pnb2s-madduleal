package cms.user;

import java.util.Objects;

public abstract class User {
    private final long id;
    private final String nome;
    private final String email;
    private final String password;

    protected User(long id, String nome, String email, String password) {
        this.id = id;
        this.nome = Objects.requireNonNull(nome, "nome");
        this.email = Objects.requireNonNull(email, "email");
        this.password = Objects.requireNonNull(password, "password");
    }

    public long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public boolean checkPassword(String candidate) {
        return Objects.equals(this.password, candidate);
    }
}
