package edu.ccrms.exception;

import java.sql.*;
import java.sql.SQLException;

public class DataIntegrityException extends RuntimeException {
    public DataIntegrityException(String message) {
        super(message);
    }

    public DataIntegrityException(String string, SQLException e) {
        super(string, e);
    }
}