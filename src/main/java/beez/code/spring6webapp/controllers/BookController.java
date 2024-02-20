package beez.code.spring6webapp.controllers;

import beez.code.spring6webapp.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by: seanbowen on 2024-02-20
 * Architecting Solutions. Simply.
 *
 * @author seanbowen
 * @version 1.0
 * @since 2024-02-20
 */
@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}
