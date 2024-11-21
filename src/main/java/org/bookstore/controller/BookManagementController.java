package org.bookstore.controller;

import lombok.extern.slf4j.Slf4j;
import org.bookstore.annotation.BaseResponse;
import org.bookstore.entity.param.BookParam;
import org.bookstore.entity.vo.BookVO;
import org.bookstore.service.BookManagementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@BaseResponse
@RequestMapping("/api/v1/book")
public class BookManagementController {

    @Resource
    BookManagementService bookManagementService;

    //获取列表
    @GetMapping
    public List<BookVO> getAllBooks() {

        return null;
    }

    //根据id获取
    @GetMapping("/{id}")
    public BookVO getBook(@PathVariable Long id) {

        return null;
    }

    //添加书籍
    @PostMapping
    public BookVO addBook(@RequestBody BookParam bookParam) {

        return null;
    }

    //更新书籍信息
    @PutMapping("/{id}")
    public BookVO updateBook(@PathVariable Long id, @RequestBody BookParam bookParam) {

        return null;
    }

    //删除书籍
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {

    }

}
