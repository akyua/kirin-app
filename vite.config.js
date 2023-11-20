import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
import 'jquery'; // Import jQuery

export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      '@': './src',
    },
  },
  // Add global scripts or variables
  optimizeDeps: {
    include: ['jquery'],
  },
});