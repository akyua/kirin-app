import { defineConfig } from "vite";
import Vue from "@vitejs/plugin-vue";
import path from "path";
import "jquery";

export default defineConfig({
  plugins: [Vue()],
  resolve: {
    alias: {
      "@": path.resolve(__dirname, "src"),
      "@backend": path.resolve(__dirname, "../backend"),
    },
  },
  css: {
    preprocessorOptions: {
      scss: {
        additionalData: `@import "@/variables/variables.scss";`,
      },
    },
  },
  optimizeDeps: {
    include: ["jquery"],
  },
  server: {
    host: "0.0.0.0",
    port: 3000,
    strictPort: true,
  },
  build: {},
});
