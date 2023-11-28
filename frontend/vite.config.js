import { defineConfig } from 'vite';
import Vue from '@vitejs/plugin-vue';
import path from 'path';
import 'jquery';

export default defineConfig({
  plugins: [Vue()],
  resolve: {
    alias: {
      '@': path.resolve(__dirname, 'src'),
      '@backend': path.resolve(__dirname, '../backend'),
    },
  },
  optimizeDeps: {
    include: ['jquery'],
  },
  server: {
    port: 3000,
  },
  build: {
  },
});