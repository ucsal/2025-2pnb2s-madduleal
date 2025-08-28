package cms.user;

public class AdminUser extends User {
    public AdminUser(long id, String nome, String email, String password) {
        super(id, nome, email, password);
    }

    // aqui ficam só métodos específicos do Admin, se houver
}
