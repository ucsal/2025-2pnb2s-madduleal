package cms.user;

public class GuestUser extends User {
    public GuestUser(long id, String nome, String email, String password) {
        super(id, nome, email, password);
    }

    // métodos específicos de Guest (se houver) ficam aqui
}
