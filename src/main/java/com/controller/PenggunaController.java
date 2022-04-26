package com.controller;

import com.model.dto.PenggunaDto;
import com.model.entity.Pengguna;
import com.repository.PenggunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pengguna")
public class PenggunaController {
    private final PenggunaRepository penggunaRepository;
    @Autowired
    public PenggunaController(PenggunaRepository penggunaRepository){
        this.penggunaRepository = penggunaRepository;
    }

    @GetMapping
    public List<PenggunaDto> get(){
        List<Pengguna> listPengguna = penggunaRepository.findAll();
        return listPengguna.stream().map(this::convertToDto).collect(Collectors.toList());
    }
    @GetMapping("/{nama}")
    public PenggunaDto get(@PathVariable String nama){
        if(penggunaRepository.findById(nama).isPresent()){
            return convertToDto(penggunaRepository.findById(nama).get());
        }
        return null;
    }
    @PostMapping
    public PenggunaDto insert(@RequestBody PenggunaDto dto){
        Pengguna pengguna = convertToEntity(dto);
        penggunaRepository.save(pengguna);
        return dto;
    }

    private PenggunaDto convertToDto(Pengguna pengguna){
        PenggunaDto penggunaDto = new PenggunaDto();
        penggunaDto.setNama(pengguna.getNamaPengguna());
        penggunaDto.setKode(pengguna.getKodePengguna());
        penggunaDto.setPeran(pengguna.getPeranPengguna());
        penggunaDto.setAlamat(pengguna.getAlamat());
        return penggunaDto;
    }
    private Pengguna convertToEntity(PenggunaDto dto){
        Pengguna pengguna = new Pengguna();
        pengguna.setNamaPengguna(dto.getNama());
        pengguna.setKodePengguna(dto.getKode());
        pengguna.setPeranPengguna(dto.getPeran());
        pengguna.setAlamat(dto.getAlamat());
        return pengguna;
    }
}
