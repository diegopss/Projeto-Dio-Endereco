package com.dio.projetocep.controller;


import com.dio.projetocep.model.Cliente;
import com.dio.projetocep.service.ClienteService;
import com.dio.projetocep.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteServiceImpl.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(clienteServiceImpl.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(
            @RequestBody Cliente cliente
    ) {
        clienteServiceImpl.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(
            @PathVariable Long id,
            @RequestBody Cliente cliente
    ) {
        clienteServiceImpl.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(
            @PathVariable Long id
    ) {
        clienteServiceImpl.deletar(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<Cliente> buscarPorNome(
            @PathVariable String nome
    ) {
        return ResponseEntity.ok(clienteServiceImpl.buscarPorNome(nome));
    }
}
