package com.example.project.restController;

import com.example.project.ApiUrls;
import com.example.project.algorithm.Demo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiUrls.INVOICE)
public class InvoiceRestController {


    @GetMapping()
    public ResponseEntity<?> getInvoice(){
        return ResponseEntity.ok(Demo.calAddress());
    }

}
