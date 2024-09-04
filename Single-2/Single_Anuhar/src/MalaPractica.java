public class MalaPractica {
    private User[] users = new User[10];
    private int userCount = 0;

    private static class User{
        private String userName;
        private String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
        public String getUserName() {
            return userName;
        }
        public String getPassword() {
            return password;
        }
    }

    public void registerUser(String userName, String password) {
        if (userCount < users.length) {
            users[userCount] = new User(userName, password);
            System.out.println("Usuario registrado");
        }else {
            System.out.println("Usuario no registrado");
        }
    }

    private User getUser(String userName) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserName().equals(userName)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean aunthenticate(String userName, String password) {
        User user = getUser(userName);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Autentificacion completada");
            return true;
        } else {
            System.out.println("Autenticación fallida");
            return false;
        }
    }

    
}