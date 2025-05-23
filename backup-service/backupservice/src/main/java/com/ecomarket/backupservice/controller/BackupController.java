package com.ecomarket.backupservice.controller;

import com.ecomarket.backupservice.service.BackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backup")
public class BackupController {

    @Autowired
    private BackupService backupService;

    @PostMapping("/run")
    public String runBackup() {
        backupService.realizarBackup();
        return "Backup realizado con éxito";
    }
}
