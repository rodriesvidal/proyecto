package com.ecomarket.backupservice.service;

import org.springframework.stereotype.Service;

@Service
public class BackupService {

    public void realizarBackup() {
        // Aquí va la lógica real de backup.
        // Por ahora solo mostramos un mensaje en consola.
        System.out.println("Backup ejecutado correctamente");
    }
}
