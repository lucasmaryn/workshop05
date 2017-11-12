package pl.maryn;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryBookService {
    private List<Book> list;


    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "Programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa Java.", "Sierra Kat", "Helion", "Programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy", "Cay Horstm", "Helion", "Programming"));
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }
}
