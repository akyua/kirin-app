import { defineConfig } from 'vite';
import Vue from '@vitejs/plugin-vue';
import path from 'path';
import 'jquery'; // Import jQuery

export default defineConfig({
  plugins: [Vue()],
  resolve: {
    alias: {
      '@': path.resolve(__dirname, 'src'),
    },
  },
  // Add global scripts or variables
  optimizeDeps: {
    include: ['jquery'],
  },
  server: {
    proxy: {
      // Proxy setup if needed
    },
  },
  build: {
    // Build options if needed
  },
});