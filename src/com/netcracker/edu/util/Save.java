package com.netcracker.edu.util;

import com.netcracker.edu.businessobjects.*;
import com.netcracker.edu.dao.FileDAO;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by FlowRyder on 29.12.2015.
 */
public class Save {
    public static final Logger LOGGER = Logger.getLogger(Save.class);

    public static void saveCollection(String collectionName) {
        String path = "C:\\Users\\FlowRyder\\IdeaProjects\\Library\\src\\com\\netcracker\\edu\\data\\";
        switch (collectionName) {
            case "book":
                try (FileWriter bookWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<Book> books = (HashSet<Book>) FileDAO.getInstance().getBooks();
                    for (Book book : books) {
                        bookWriter.write(book.write());
                        bookWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
            case "account":
                try (FileWriter accountWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<Account> accounts = (HashSet<Account>) FileDAO.getInstance().getAccounts();
                    for (Account account : accounts) {
                        accountWriter.write(account.write());
                        accountWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
            case "author":
                try (FileWriter authorWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<Author> authors = (HashSet<Author>) FileDAO.getInstance().getAuthors();
                    for (Author author : authors) {
                        authorWriter.write(author.write());
                        authorWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
            case "genre":
                try (FileWriter genreWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<Genre> genres = (HashSet<Genre>) FileDAO.getInstance().getGenres();
                    for (Genre genre : genres) {
                        genreWriter.write(genre.write());
                        genreWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
            case "reader":
                try (FileWriter readerWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<Reader> readers = (HashSet<Reader>) FileDAO.getInstance().getReaders();
                    for (Reader reader : readers) {
                        readerWriter.write(reader.write());
                        readerWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
            case "booktype":
                try (FileWriter booktypeWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<BookType> booktypes = (HashSet<BookType>) FileDAO.getInstance().getBookTypes();
                    for (BookType bookType : booktypes) {
                        booktypeWriter.write(bookType.write());
                        booktypeWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
            case "librarian":
                try (FileWriter librarianWriter = new FileWriter(path + collectionName + ".txt", false)) {
                    HashSet<Librarian> librarians = (HashSet<Librarian>) FileDAO.getInstance().getLibrarians();
                    for (Librarian librarian : librarians) {
                        librarianWriter.write(librarian.write());
                        librarianWriter.write(System.lineSeparator());
                    }
                } catch (IOException e) {
                    LOGGER.info(e.getMessage());
                }
                break;
        }
    }
}
