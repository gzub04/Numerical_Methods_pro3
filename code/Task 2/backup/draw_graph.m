function draw_graph(type)
    if type == "ode_45"
        figure;
        t_bounds = [0, 15];
        init_x = [-0.4, 0.5];
        ode45(@func, t_bounds, init_x);
        legend("x1(t)", "x2(t)");
    elseif type == "RK4"
        % draws x1(t) with different steps
        figure;
        h = 2;
        while (h >= 0.0625)
        [t, x] = RK4(h);
        plot(t, x(:, 1));
        hold on;
        h = h/2;
        end
        legend("Step: " + 2, "Step: " + 1, "Step: " + 0.5, "Step: " + 0.25, "Step: " + 0.125, "Step: " + 0.0625);
        title("x1(t) with different step size");
        hold off;
        % draws x2(t) with different steps
        figure;
        h = 2;
        while (h >= 0.0625)
        [t, x] = RK4(h);
        plot(t, x(:, 2));
        hold on;
        h = h/2;
        end
        legend("Step: " + 2, "Step: " + 1, "Step: " + 0.5, "Step: " + 0.25, "Step: " + 0.125, "Step: " + 0.0625);
        title("x2(t) with different step size");
        hold off;
    else
        error("Wrong type of graph chosen!");
    end
end
    