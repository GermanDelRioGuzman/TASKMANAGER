import React, { useState } from 'react';
import axios from 'axios';

const AddTask = ({ boardId }) => {
  const [title, setTitle] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    await axios.post(`/api/tasks`, { title, boardId });
    window.location.reload();
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={title} onChange={(e) => setTitle(e.target.value)} />
      <button type="submit">Agregar Tarea</button>
    </form>
  );
};

export default AddTask;
