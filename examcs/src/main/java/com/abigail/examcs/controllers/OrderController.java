package com.abigail.examcs.controllers;

import java.util.List;
import java.util.Optional;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import com.abigail.examcs.models.Orders;
import com.abigail.examcs.models.OrderStatus;
import com.abigail.examcs.services.OrderService;
import com.abigail.examcs.payloads.CreateOrderRequest;
import com.abigail.examcs.payloads.CreateOrderDTO;
import com.abigail.examcs.security.UserPrincipal;
import com.abigail.examcs.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/api/v1/orders")
@SecurityRequirement(name = "bearerAuth")
public class OrderController {
    
}
