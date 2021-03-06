package me.BetterAntiSwear;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class ConfigManager {
    public FileConfiguration createConfig(String name, String subdirectory, Plugin plugin) throws IOException {
        File dir = new File(plugin.getDataFolder() + File.separator + subdirectory);
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            file.createNewFile();
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration createConfig(String name, Plugin plugin) throws IOException {
        File dir = plugin.getDataFolder();
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = new File(plugin.getDataFolder(), String.valueOf(name) + ".yml");
        if (!file.exists()) {
            file.createNewFile();
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration createConfig(String name, String directory) throws IOException {
        File dir = new File(directory);
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            file.createNewFile();
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration createConfig(String name, File directory) throws IOException {
        if (!directory.isDirectory()) {
            directory.mkdirs();
        }
        File file = new File(directory, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            file.createNewFile();
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public void saveConfig(FileConfiguration config, String name, String subdirectory, Plugin plugin) throws IOException {
        File dir = new File(plugin.getDataFolder() + File.separator + subdirectory);
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        config.save(file);
    }
    
    public void saveConfig(FileConfiguration config, String name, Plugin plugin) throws IOException {
        File dir = plugin.getDataFolder();
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = new File(plugin.getDataFolder(), String.valueOf(name) + ".yml");
        config.save(file);
    }
    
    public void saveConfig(FileConfiguration config, String name, String directory) throws IOException {
        File dir = new File(directory);
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        config.save(file);
    }
    
    public void saveConfig(FileConfiguration config, String name, File directory) throws IOException {
        if (!directory.isDirectory()) {
            directory.mkdirs();
        }
        File file = new File(directory, String.valueOf(name) + ".yml");
        config.save(file);
    }
    
    public FileConfiguration getConfig(String name, String subdirectory, Plugin plugin) {
        File dir = new File(plugin.getDataFolder() + File.separator + subdirectory);
        if (!dir.isDirectory()) {
            return null;
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            return null;
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration getConfig(String name, Plugin plugin) {
        File dir = plugin.getDataFolder();
        if (!dir.isDirectory()) {
            return null;
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            return null;
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration getConfig(String name, String directory) {
        File dir = new File(directory);
        if (!dir.isDirectory()) {
            return null;
        }
        File file = new File(dir, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            return null;
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration getConfig(String name, File directory) {
        if (!directory.isDirectory()) {
            return null;
        }
        File file = new File(directory, String.valueOf(name) + ".yml");
        if (!file.exists()) {
            return null;
        }
        return (FileConfiguration)YamlConfiguration.loadConfiguration(file);
    }
    
    public FileConfiguration reloadConfig(String name, String subdirectory, Plugin plugin) {
        File dir = new File(plugin.getDataFolder() + File.separator + subdirectory);
        if (!dir.isDirectory()) {
            return null;
        }
        FileConfiguration config = getConfig(name, subdirectory, plugin);
        try {
            config.load(new File(dir, String.valueOf(name) + ".yml"));
        } catch (IOException|org.bukkit.configuration.InvalidConfigurationException e) {
            e.printStackTrace();
        } 
        return config;
    }
    
    public FileConfiguration reloadConfig(String name, Plugin plugin) {
        File dir = plugin.getDataFolder();
        if (!dir.isDirectory()) {
            return null;
        }
        FileConfiguration config = getConfig(name, plugin);
        try {
            config.load(new File(dir, String.valueOf(name) + ".yml"));
        } catch (IOException|org.bukkit.configuration.InvalidConfigurationException e) {
            e.printStackTrace();
        } 
        return config;
    }
    
    public FileConfiguration reloadConfig(String name, String directory) {
        File dir = new File(directory);
        if (!dir.isDirectory()) {
            return null;
        }
        FileConfiguration config = getConfig(name, directory);
        try {
            config.load(new File(dir, String.valueOf(name) + ".yml"));
        } catch (IOException|org.bukkit.configuration.InvalidConfigurationException e) {
            e.printStackTrace();
        } 
        return config;
    }
    
    public FileConfiguration reloadConfig(String name, File directory) {
        if (!directory.isDirectory()) {
            return null;
        }
        FileConfiguration config = getConfig(name, directory);
        try {
            config.load(new File(directory, String.valueOf(name) + ".yml"));
        } catch (IOException|org.bukkit.configuration.InvalidConfigurationException e) {
            e.printStackTrace();
        } 
        return config;
    }
}
