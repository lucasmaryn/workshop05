package pl.maryn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.maryn.Book;
import pl.maryn.MemoryBookService;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/hello")
    public String hello(){
        return "{hello: World}";
    }

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1,
                "9782123456803",
                "Szukając Kopciuszka",
                "Colleen Hoover",
                "Moondrive",
                "nieznany");
    }

    MemoryBookService memoryBookService;

    @RequestMapping("/memoryService")
    public List books() {
        return memoryBookService.getList();
    }

    @Autowired
    public void setBookService(MemoryBookService memoryBookService) {
        this.memoryBookService = memoryBookService;
    }

}
