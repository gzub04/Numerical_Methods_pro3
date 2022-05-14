function solve_and_print_t1()
    fprintf("Degree:\t Condition number:\t Error residuum:\n");
    for i = 0:10    % loop for up to polynomial of degree 10
        % print text
        [cond_num, err, a_vector, x, y] = poly_approximation(i);  % calculate polynomial of degree i and get condition number and error
        fprintf("%d\t\t %e\t\t %f\n", i, cond_num, err);

        %plot graph
        x_axis = -5:.01:5; % step between each calculated f(x)
        figure; % needed for multiple graphs
        grid on;
        plot(x_axis, polyval(a_vector, x_axis));
        title("Degree: " + i ); % Puts a title with the degree of polynomial
        hold on;
        plot(x, y, 'o');
    end
end