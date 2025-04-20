# JDA Plugin

A simple multiplatform Minecraft plugin with JDA integration, supporting Bukkit/Spigot, BungeeCord, and Velocity.

## Features

- Logs "JDA Plugin Enabled" on startup and "JDA Plugin Disabled" on shutdown.
- Shades JDA (Java Discord API) into the JAR to avoid conflicts.
- Built with Maven and compiled via GitHub Actions.

## Building

1. Clone the repository.
2. Run `mvn clean package` to build the plugin.
3. The JAR will be in the `target/` directory.

## GitHub Actions

- The workflow (`build.yml`) compiles the plugin on push or pull request to the `main` branch.
- The resulting JAR is uploaded as an artifact named `JDA-Plugin`.

## Usage

- Place the JAR in the `plugins/` folder of your Bukkit, BungeeCord, or Velocity server.
- Start the server to see the enable/disable messages in the console.

## License

MIT License