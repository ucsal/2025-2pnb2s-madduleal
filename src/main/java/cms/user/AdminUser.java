package cms.user;

public class AdminUser extends User {
    public AdminUser(long id, String nome, String email, String password) {
        super(id, nome, email, password);
    }
    // métodos específicos de Admin (se houver) ficam aqui
}
