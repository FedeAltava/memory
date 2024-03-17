//package memory;
//
//import utilidades.bbdd.Gestor_conexion_POSTGRE;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class CrearJugador {
//
//    // Método para registrar un nuevo jugador en la base de datos
//    public static boolean registrarJugador(Gestor_conexion_POSTGRE gestor, String nick, String contraseña) {
//        // Verificar si la conexión es válida
//        if (gestor != null && gestor.getConexion() != null) {
//            // Sentencia SQL para insertar un nuevo jugador
//            String sql = "INSERT INTO jugadores (nick_jugador, contraseña) VALUES (?, ?)";
//
//            try {
//                // Preparar la sentencia SQL
//                PreparedStatement pstmt = gestor.getConexion().prepareStatement(sql);
//                pstmt.setString(1, nick);
//                pstmt.setString(2, contraseña);
//
//                // Ejecutar la sentencia SQL
//                pstmt.executeUpdate();
//
//                // Indicar que el jugador se registró exitosamente
//                return true;
//            } catch (SQLException e) {
//                // Manejar cualquier excepción que pueda ocurrir durante el registro
//                System.err.println("Error al registrar el jugador: " + e.getMessage());
//                return false;
//            }
//        } else {
//            // La conexión no es válida
//            System.err.println("Error: la conexión a la base de datos no es válida.");
//            return false;
//        }
//    }
//}
//
//
//
//
//