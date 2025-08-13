# RockyLib API

**RockyLib** is an open-source library primarily used in **RockyDev** mods, but designed to be freely usable by any creator in the Minecraft community.  

Its goal is to provide utilities and tools that simplify cross-platform mod development.

RockyLib is currently being expanded with support for new platforms, including **The Quilt**.

---

## 📦 Features
- Easy integration API for Minecraft mods.
- Support for multiple loaders: Forge, Fabric, NeoForged, and soon Quilt.
- Open source and extensible by the community.
- Actively maintained project.

---

## 🛠 Installation
Include the dependency in your `build.gradle`:

```gradle
repositories {
    maven { url "https://your-repo-url" }
}

dependencies {
    implementation "dev.rocky:rockylib:VERSION"
}
