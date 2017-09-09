package com.example.lang.mvctest.controller;


import com.example.lang.mvctest.R;
import com.example.lang.mvctest.bean.Book;
import com.example.lang.mvctest.model.BookModel;

import java.util.List;

/**
 * 控制器层
 * 处理业务逻辑，调用模型层的操作，并对外暴露接口
 */

public class BookController {
    private BookModel mode;

    public BookController() {
        mode = new BookModel();
    }

    /**
     * 添加书本
     * @param listener
     */
    public void add(onAddBookListener listener) {
        mode.addBook("JavaWeb从入门到精通", R.drawable.ic_launcher);
        if (listener != null) {
            listener.onComplete();
        }
    }

    /**
     * 删除书本
     * @param listener
     */
    public void delete(onDeleteBookListener listener) {
        if(mode.query().isEmpty()){
            return;
        }else{
            mode.deleteBook();
        }
        if (listener != null) {
            listener.onComplete();
        }
    }

    /**
     * 查询所有书本
     * @return
     */
    public List<Book> query() {
        return mode.query();
    }

    /**
     * 添加成功的回调接口
     */
    public interface onAddBookListener {
        void onComplete();
    }

    /**
     * 删除成功的回调接口
     */
    public interface onDeleteBookListener {
        void onComplete();
    }
}
