package com.example.menu.controller;

import com.example.menu.model.Assets;
import com.example.menu.payload.request.AssetsCreateRequest;
import com.example.menu.payload.response.MessageResponse;
import com.example.menu.repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/assets")
public class AssetsController {

    @Autowired
    AssetsRepository assetsRepository;



    @PostMapping("/create")
    public ResponseEntity<Object> createAssets(@RequestBody AssetsCreateRequest assetsCreateRequest) {
        if (assetsRepository.existsAssetsByScientificName(assetsCreateRequest.getScientificName())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Scientific name is already taken!"));
        }
        try {
            Assets _assets = assetsRepository
                    .save(new Assets(assetsCreateRequest.getLocalName(), assetsCreateRequest.getScientificName(), assetsCreateRequest.getLocation()));
            return new ResponseEntity<>(_assets, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Assets>> getAllAssets(@RequestParam(required = false) String scientificName) {
      try{
          List<Assets> assets=new ArrayList<Assets>();
          if(scientificName==null){
              assetsRepository.findAll().forEach(assets::add);
          }
          else{
              assetsRepository.findByScientificName(scientificName).forEach(assets::add);
          }
          return new ResponseEntity<>(assets, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


