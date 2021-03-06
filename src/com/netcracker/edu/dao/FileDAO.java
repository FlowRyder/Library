package com.netcracker.edu.dao;

import com.netcracker.edu.businessobjects.*;
import com.netcracker.edu.util.Load;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by FlowRyder on 29.12.2015.
 */
public class FileDAO {
    public static final Logger LOGGER = Logger.getLogger(FileDAO.class);
    private static FileDAO INSTANCE = new FileDAO();
    private Collection<Book> books;
    private Collection<Account> accounts;
    private Collection<Author> authors;
    private Collection<Genre> genres;
    private Collection<BookType> bookTypes;
    private Collection<Reader> readers;
    private Collection<Librarian> librarians;

    private FileDAO() {
        genres = Load.loadGenres();
        authors =  Load.loadAuthors();
        bookTypes = Load.loadBookTypes();
        readers = Load.loadReader();
        books = Load.loadBooks();
        accounts = Load.loadAccounts();
        librarians = Load.loadLibrarians();
    }

    public IDObject choose(Collection<? extends IDObject> collection, int id) {
        for (IDObject idObject : collection) {
            if (idObject.getId() == id) {
                return idObject;
            }
        }
        return null;
    }

    public void show() {
        LOGGER.info("Genre");
        for(Genre genre : FileDAO.getInstance().getGenres()) {
            LOGGER.info(genre.toString());
        }
        LOGGER.info("Author");
        for(Author author : FileDAO.getInstance().getAuthors()) {
            LOGGER.info(author.toString());
        }
        LOGGER.info("BookType");
        for(BookType bookType : FileDAO.getInstance().getBookTypes()) {
            LOGGER.info(bookType.toString());
        }

    }

    public static FileDAO getInstance() {
        return INSTANCE;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public Collection<Account> getAccounts() {
        return accounts;
    }

    public Collection<Author> getAuthors() {
        return authors;
    }

    public Collection<Genre> getGenres() {
        return genres;
    }

    public Collection<BookType> getBookTypes() {
        return bookTypes;
    }

    public Collection<Reader> getReaders() {
        return readers;
    }

    public Collection<Librarian> getLibrarians() {
        return librarians;
    }
}
