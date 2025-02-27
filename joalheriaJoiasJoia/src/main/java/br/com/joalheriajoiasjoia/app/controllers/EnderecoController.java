package br.com.joalheriajoiasjoia.app.controllers;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    
    @PostMapping
    public ResponseEntity<Endereco> addEndereco(@RequestBody Endereco endereco) {
        Endereco newEndereco = enderecoService.addEndereco(endereco);
        return ResponseEntity.ok(newEndereco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> updateEndereco(@PathVariable Long id, @RequestBody Endereco enderecoDetails) {
        Endereco updatedEndereco = enderecoService.updateEndereco(id, enderecoDetails);
        return ResponseEntity.ok(updatedEndereco);
    }


    @GetMapping
    public ResponseEntity<List<Endereco>> getAllEnderecos() {
        List<Endereco> enderecos = enderecoService.getAllEnderecos();
        return ResponseEntity.ok(enderecos);
    }

    // Endpoint para obter um endereço por id
    @GetMapping("/{id}")
    public ResponseEntity<Endereco> getEnderecoById(@PathVariable Long id) {
        Endereco endereco = enderecoService.getEnderecoById(id);
        return ResponseEntity.ok(endereco);
    }

    // Endpoint para excluir um endereço por id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEndereco(@PathVariable Long id) {
        enderecoService.deleteEndereco(id);
        return ResponseEntity.noContent().build();
    }
}
